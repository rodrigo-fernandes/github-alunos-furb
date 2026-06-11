package furb.estrutura;

import java.util.ArrayList;
import java.util.List;

public class MainListas {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		// Insrindo alunos para dentro da lista
		alunos.add(new Aluno(123l, "Rodrigo", "Fernandes"));
		alunos.add(new Aluno(1234l, "Maria", "Teste"));
		alunos.add(new Aluno(12345l, "Joao", "Gabriel"));
		alunos.add(new Aluno(12l, "Fernando", "Moraes"));

		Aluno alunoTestinho = new Aluno(123567l, "Teste", "Testinho");
		alunos.add(alunoTestinho);
		
		// Percorrendo os alunos que estao na lista
		for (Aluno alunoAtual : alunos) {
			System.out.println(alunoAtual.toString());
		}
		
		System.out.println("\n\nAlunos pesquisado pelo get");
		System.out.println(alunos.get(1)); 	
		
		Aluno alunoTeste = new Aluno(1231231l, "lalala", "lelele");

		System.out.println("\n\n");
		// Valida se o aluno existe dentro da minha lista de alunos 
		if (alunos.contains(alunoTestinho)) {
			System.out.println("\n\nAluno encontrado é: " + alunos.indexOf(alunoTestinho));
		} else {
			System.out.println("Aluno não encontrado dentro da lista");
		}
		
		// retorna o primeiro valor da lista
		System.out.println("\n\nPrimeirio elemento da lista");
		System.out.println(alunos.getFirst());

		// retorna o ultimo valor da lista
		System.out.println("\n\nUltimo elemento da lista");
		System.out.println(alunos.getLast());
		
		if (alunos.isEmpty()) {
			System.out.println("Lista de alunos está vazia");
		} else {
			System.out.println("Lista de alunos não está vazia");
		}
		
	}

}
