/*
Estudo da classe List
*/
package com.ocaj.chamada;
import java.util.*;

public class EstudoList{

	public void manipulaList(){
	// array para preencher a lista para os exemplos
	String[] letras = {"a", "b", "c", "d", "e", "e", "f"};
	String[] letras2 = {"a", "b", "x", "y", "z", "k", "w"};
	//criando uma lista ArrayList
	List<String> listaStr1 = Arrays.asList(letras);
	List<String> listaStr2 = Arrays.asList(letras2);
	System.out.println(listaStr1);
	System.out.println(listaStr2);
	List<String> listaStr3 = new ArrayList<String>(listaStr1);
	System.out.println("Lista 3 recem criada : " + listaStr3);
	listaStr3.addAll(listaStr2);
	System.out.println("Lista 3 + lista2 : " + listaStr3);	
	//pegando valores em determinada posiça da lista
	System.out.println("Terceiro elemento da lista2 : " + listaStr2.get(2)); // o índice é baseado em zero
    // troca o valor de um elemento na lista2 na posiçao 4
    listaStr2.set(4, "Q");
    System.out.println(listaStr2);
    // insere o valor de um elemento na lista2 na posiçao 5  
    String valor = "Ç";  
    listaStr3.add(2, valor);
    System.out.println(listaStr3);
	List<Integer> arrlist = new ArrayList<Integer>(5);
	arrlist.add(15);
    arrlist.add(22);
    arrlist.add(30);
    arrlist.add(40);
    arrlist.add(2,25);
    for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }
	}
}