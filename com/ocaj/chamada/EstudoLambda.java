package com.ocaj.chamada;

import java.util.*;
import com.ocaj.chamadora.Pessoa;
import java.util.function.*;

public class EstudoLambda{
/*
    public void estudobasico(){
    	Predicate<Integer> atLeast5 = x -> x > 5;
    }
*/

	/*
	public void  listaSemLambda(List<Pessoa> pessoas, int idade){
		for (Pessoa p : pessoas){
			if (p.getIdade() >= idade){
				p.printPessoa();
			}
		}
	}  */
public void  listaComLambda(List<Pessoa> pessoas, int idade){

	  /*pessoas.forEach( p -> {System.out.println(p.getIdade());
	    System.out.println(p.getNome());
	  }); */

	  pessoas
	  .stream()
	  .filter(p -> p.getIdade() > idade)
	  .forEach(p -> System.out.println(p.getNome()));

	} 

} 

