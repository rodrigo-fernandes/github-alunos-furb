package furb.estrutura;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
	
	public static void main(String[] args) {
		
		// cria o map e inicializa ele vazio
		Map<Long, Aluno> alunos = new HashMap<>();
		
		// adiciona valores dentro do map
		alunos.put(1L, new Aluno(1L, "Rodrigo", "Teste 1"));
		alunos.put(2L, new Aluno(2L, "Maria", "Teste lalala"));
		alunos.put(3L, new Aluno(3L, "Joao", "Teste 12222"));
		alunos.put(4L, new Aluno(4L, "Teste", "Testinho"));
		
		// buscar o valor do joao
		System.out.println(alunos.get(4L));
		
		// cria o map de String e String e inicializa ele vazio
		Map<String, String> cidades = new HashMap<>();
		cidades.put("SC", "Blumenau");
		cidades.put("RJ", "Rio de Janeiro");
		cidades.put("SP", "Sao Paulo");
		
		// Busca pela chave, no caso o estado
		System.out.println(cidades.get("RJ"));

		// se existe a cidade no valor do map, entao existe no map
		if (cidades.containsValue("Blumenau")) {
			System.out.println("Cidade Blumenau encontrada no map");
		} else {
			System.err.println("Cidade não encontrada");
		}
		
		System.out.println("Tamanho do map é: " + cidades.size());
		
		
		// limpa o map
		cidades.clear();
		System.out.println(cidades);
		
		
		
	}

}
