package sef.ATestTask.ThirdActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sef.ATestTask.FirstActivity.Employee;

public class EmployeesDataBase  {

	public static void main(String[] args) {
		// create connection
		createConnection();
		insertEmployee(null);
	}

	
	public static Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "robertpass";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
		
	//insertEmployee
	public static void insertEmployee(Employee emp)
	{
		Connection con = createConnection();
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		try {
		PreparedStatement pStmt = con.prepareStatement("insert into employee values (?,?,?,?)");
		con.setAutoCommit(false);
		//	Substitute the ? now.
		pStmt.setInt(1, emp.getAge());
		pStmt.setString(2, emp.getFirstName());
		pStmt.setString(3, emp.getSecondName());
		pStmt.setInt(4, (int) emp.getSalary());
		//2 - Execute this query using executeUpdate()
		int rows = pStmt.executeUpdate();
		System.out.println(rows + " row(s) added!");
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
