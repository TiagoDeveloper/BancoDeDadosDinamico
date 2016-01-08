package br.com.tiagoDeveloper.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;





public class ConnectionFactory {
	
	
	public Connection getConnection(){
		
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		return DriverManager.getConnection("jdbc:mysql://localhost/tabela","root","vertrigo");
		
		}catch(Exception e){throw new RuntimeException(e);}
		
		
	}//fim do método getConnection()

}//fim da classe connectionFactory
