//Classe chamadora de classes a serem testadas
package com.ocaj.chamadora;
import com.ocaj.chamada.Exercicio_001;
import com.ocaj.chamada.Exercicio_002;
import com.ocaj.chamada.EstudoCollections;
import com.ocaj.chamada.EstudoList;
import com.ocaj.chamada.EstudoLambda;
import java.util.*;
import com.ocaj.chamadora.Pessoa;

public class Teste_001 {
	public static void main(String args[]) {
	  //Exercicio_001  ex1 = new Exercicio_001();
	  //Exercicio_002  ex2 = new Exercicio_002();
	  //ex1.imprimeTextString(" Teste de chamada de classe !!");
	  //ex2.imprimeLocal();
/*
	  EstudoCollections ex3 = new EstudoCollections();
	  List<String> list = new ArrayList<>();
	  list.add("a");
	  list.add("b");
	  list.add("c");
	  list.add("x");
	  list.add("y");
	  ex3.testaSetHashSet(list);
	  String listString[] = new String[05];
	  listString[0] = "a";
	  listString[1] = "b";
	  listString[2] = "c";
	  listString[3] = "a";
	  listString[4] = "b";
	  ex3.testaSet(listString);
	  ex3.operaComDoisConjuntos(list, listString); 
*/
	 //EstudoList ex4 = new EstudoList();
	 //ex4.manipulaList();
	 Pessoa p1 = new Pessoa();
	 Pessoa p2 = new Pessoa();
	 p1.setNome("Jose");
	 p1.setIdade(15);
     p2.setNome("Maria");
     p2.setIdade(20);
     List<Pessoa> lis = new ArrayList<Pessoa>();
     lis.add(p1);
     lis.add(p2);
     EstudoLambda ex5 = new EstudoLambda();
     //ex5.listaSemLambda(lis, 10);
     ex5.listaComLambda(lis, 16);


	}
}