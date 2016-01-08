package br.com.tiagoDeveloper.teste;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import br.com.tiagoDeveloper.jdbc.Crud;


public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		
		
		Crud crud = new Crud();
		
		
		ResultSet rs = null;
		
		
		rs = crud.listarDados();
		
		
		ResultSetMetaData rsmd = rs.getMetaData();
		

		int numColunas = rsmd.getColumnCount();//pega o número de colunas da tabela do banco de dados
		
		
		
		for(int i = 1; i <= numColunas; i++){
			
			
			System.out.println("coluna: "+ i +" tipo: "+ rsmd.getColumnTypeName(i));
			
		}//fim do for
		
		
	
		
			
	  			System.out.println(numColunas);
				
				while(rs.next()){
				
			/*Isso:*/System.out.println(rs.getMetaData().getColumnName(1));
					System.out.println(rs.getInt("id"));
					
					System.out.println(rs.getMetaData().getColumnName(2));
					System.out.println(rs.getString("nome"));
				
					
/*É igual a isso:	System.out.println(rs.getMetaData().getColumnName(1));
					System.out.println(rs.getInt(rs.getMetaData().getColumnName(1)));

					System.out.println(rs.getMetaData().getColumnName(2));
					System.out.println(rs.getString(rs.getMetaData().getColumnName(2))); */
				}
		
			
		
		
	}//fim do método principal

}//fim da classe testaConexao
