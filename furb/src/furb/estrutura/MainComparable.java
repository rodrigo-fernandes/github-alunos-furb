package furb.estrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
	
	public static void main(String[] args) {

		// cria a lista e inicializa ela vazia
		List<Aluno> alunos = new ArrayList<>();
		
		// adiciona alunos para dentro da lista
		alunos.add(new Aluno(3L, "Rodrigo", "Fernandes"));
		alunos.add(new Aluno(50L, "Bruno", "Fernandes"));
		alunos.add(new Aluno(1L, "Maria", "Fernandes"));
		alunos.add(new Aluno(5L, "Aline", "Fernandes"));
		
		// mostra antes de ordenar
		System.out.println("Antes da ordenacao: ");
		for(Aluno alunoCorrente : alunos) {
			System.out.println(alunoCorrente);
		}
		
		// neste momento, ele esta ordenando a lista, só isso
		Collections.sort(alunos);
		
		System.out.println("Depois da ordenacao: ");
		for(Aluno alunoCorrente : alunos) {
			System.out.println(alunoCorrente);
		}
		
		Collections.sort(alunos, new AlunoOrdenadoPorNome());
		
		System.out.println("Depois da ordenacao PELO NOME: ");
		for(Aluno alunoCorrente : alunos) {
			System.out.println(alunoCorrente);
		}
		
	}
	

}
