package br.com.tiagoDeveloper.Classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EstruturaDaClasse {

	
	public EstruturaDaClasse(Object classe){
		
		
		Field[] atributos = classe.getClass().getDeclaredFields();
		
		
		for(Field att : atributos){
			
			
			System.out.println(att.getName());
			System.out.println("Tipo da variável: " + att.getType().getName());
			
			
		}//fim do for que mostra as variáveis declaradas
		
		Method[] metodos = classe.getClass().getDeclaredMethods();
		
		
		for(Method mdt : metodos){
			
			
			System.out.println(mdt.getName());
			System.out.println("Tipo de retorno: "+mdt.getReturnType().getName());
						
			
		}//fim do for que mostra os metodos da classe
		
		
		
		
	}//fim do método construtor
	
	
}//fim da classe
