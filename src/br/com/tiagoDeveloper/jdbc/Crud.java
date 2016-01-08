package br.com.tiagoDeveloper.jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	
	private Connection conexao;

	public Crud(){
	
		this.conexao = new ConnectionFactory().getConnection();
		
	}//Fim do método construtor
	
	/**********************************************&&*****************************************/

	public void incluirDado(Object classe) throws SQLException{
		
		

		String sql = "insert into tabela values(?,?)";
		
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		
		stmt.setString(1,null);
		stmt.setString(2,"Tânia");
	
		stmt.executeUpdate();
		
		
	}//fim do metodo inclurDado
	
	/**********************************************&&*****************************************/
	
	public ResultSet listarDados(){
		
		ResultSet rs = null;
		PreparedStatement stmt;
		String sql = "Select*from tabela";
		
		try{
			
			stmt = this.conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
						
		}catch(SQLException e){}

		return rs;
		
	}//fim do mátodo listarDados()

}//fim da classe Crud
