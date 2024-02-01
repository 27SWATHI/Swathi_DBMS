package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class SqlProject {
	
	public static void main(String []args) {
		try {
		String url="jdbc:mysql://localhost:3306/GL";
		String username="root";
		String password="Swathi27";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection(url,username,password);
		System.out.println("connection established");

		String query = "create table employee(id int primary key,name varchar(50),Email_id varchar(50),phone_number varchar(20))";

		String query1 = "insert into employee(id,name,email_id,phone_number) values(1,'swathy','swathy2799','78377773875'),"

		+ "(2,'pavi','pavi9099','38809809809'),(3,'gokul','gokul145','865398162672'),(4,'bava','bava621','9852423626')"

		+ ",(5,'kavi','kavi1922','817568598')";

		String query2 = "alter table employee modify column email_id varchar(30) not null";

		String query3 = "insert into employee values(6,'uma','uma435','0272727466'),(7,'pushpa','pushpa635','93645146524')";

		String query4 = "update employee SET Name = 'Karthik', Phone_Number = '1234567890'" + "WHERE Id = 3;";

		String query5 = "delete from employee where id in(3,4)";

		String query6 = "delete from employee";

		Statement st=connect.createStatement();

	    st.execute(query);
		st.execute(query1);
		st.execute(query2);
		st.execute(query3);
		st.execute(query4);
		st.execute(query5);
		st.execute(query6);

		st.close();
		connect.close();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}

}