package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
      //declara�ao de lista importar  java.util.List e java.util.ArrayList apertando Ctrl + Shift + O
		List<String> lista = new ArrayList<>();
		
		//adicionando na lista
		lista.add("Gilliano");
		lista.add("Kau�"); 
		lista.add("Kaiky");
		lista.add("Terezinha");
		
		//percorrendo a lista com foreach
		
		for( String x: lista) {
			System.out.println(x);
		}
		
		//para adicionar um elemento na posi��o 2
		lista.add(2,"Kethelin");
		
		// para remover  um elemento
		lista.remove("Gilliano");
		
		//remover por posi��o
		lista.remove(0); 
		
		//remover quem come�a com a letra K - remove na posi��o zero quem tem k
		lista.removeIf(x -> x.charAt(0)=='K');
		 
		// para encontrar a posi��o de um elemento 
		// quando n�o encontra o elemento a posi��o da -1
		System.out.println(lista.indexOf("jo�o"));
		System.out.println(lista.indexOf("Terezinha"));
		
	   for( String x: lista) {
		System.out.println(x);
	}
	   
	   
		//adicionando na lista
		lista.add("Gilliano");
		lista.add("Kau�"); 
		lista.add("Kaiky");
		lista.add("Terezinha");
		
		// para filtrar a lista toda quem come�a com K o stream serve para aceitar lambda
		// filter recebe um predicado o que deseja filtrar
		// o stream nao � compativel com lista..para isso usar o .collect
	   List<String> result = lista.stream().filter(x -> x.charAt(0)=='K').collect(Collectors.toList());
	  //mostra nova lista result
	   for( String x: result) {
		System.out.println(" lista com letra k inicial - " + x);
	}
	   
	   //para encontrar o primeiro elemento usa o findFirst 
	   //orElse se o elelmento n�o existir retornar null
	   
	   String nome = lista.stream().filter(x -> x.charAt(0)=='K').findFirst().orElse(null);
	   System.out.println("Primeiro com letra k �: " + nome);
	   
	   
	   String nomenaoexiste = lista.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
	   System.out.println("Primeiro com letra J �: " + nomenaoexiste);
	}

}
