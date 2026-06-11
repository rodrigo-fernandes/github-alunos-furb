package furb.estrutura;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
	
	public static void main(String[] args) {
		
		// cria o set e inicializa ele vazio
		Set<String> nomes = new HashSet<>();
		
		// adiciona valores para dentro do Set
		nomes.add("Rodrigo");
		nomes.add("Maria");
		nomes.add("Joao");
		nomes.add("Rodrigo");
		
		// Percorre o set e e apresenta o nome de cada um 
		System.out.println("Elementos do Set: ");
		for(String nomeAtual : nomes) {
			System.out.println(nomeAtual);
		}
		
		// monstra a quantidade de elementos/tamanho dentro Set 
		System.out.println("Quantidade valores set é: " + nomes.size());
		
		if (nomes.isEmpty()) {
			System.out.println("Nomes está vazio");
		}
		
		if (nomes.contains("Rodrigo")) {
			System.out.println("Nome Rodrigo encontrado no Set");
		}
		
	}
	

}
