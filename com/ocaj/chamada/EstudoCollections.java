//Classe para estudo de collections 
//pacote base java.util
package com.ocaj.chamada;
import java.util.*;
import java.util.stream.*;

public class EstudoCollections {

		public void testaSet(String[] letras){
			
			Set<String> letrasDistintas = Arrays.asList(letras).stream()
			.collect(Collectors.toSet());

			System.out.println(letrasDistintas.size() + " letras : " + letrasDistintas); 
		}

		public void testaSetHashSet(List<String> letras){
			
			Set<String> letrasDistintas = new HashSet<String>();
			
			for (String a : letras) {
				letrasDistintas.add(a);
			}

			System.out.println(letrasDistintas.size() + " letras : " + letrasDistintas);
		}

		public void operaComDoisConjuntos(List<String> con01, String[] con02){
			
			Set<String> conjunto01 = new HashSet<String>();
			Set<String> conjunto02 = new HashSet<String>();
			
			for (String a : con01) {
				conjunto01.add(a);
			}

			for (String b : con02) {
				conjunto02.add(b);
			}

			// Verifica se os dois conjuntos são iguais verificando se o conjunto2 é 
			// subconjunto do conjunto1
            if(conjunto01.containsAll(conjunto02)){
            	System.out.println("Os conjuntos são iguais !! ");
            }
            else {
               System.out.println("Os conjuntos são diferentes !! ");
            }

            // União de dois conjuntos
            Set<String> union = new HashSet<String>(conjunto01);
            union.addAll(conjunto02);  // realiza a uniao dos conjuntos
            System.out.println(" Uniao dos conjuntos : " + union);

            // Interseção dos conjuntos
            Set<String> intersecao = new HashSet<String>(conjunto01);
            intersecao.retainAll(conjunto02); // realiza interseçao
            System.out.println("Interseção dos conjuntos : " + intersecao);

            // diferença entre os dois conjuntos
            Set<String> diferenca = new HashSet<String>(conjunto01);
            diferenca.removeAll(conjunto02); //remove a interseção
            System.out.println("Diferença entre os conjuntos : " + diferenca);

		}
}