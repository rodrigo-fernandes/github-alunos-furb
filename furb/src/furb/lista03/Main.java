package furb.lista03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoaTeste = new Pessoa();
		pessoaTeste.setNome("Aluno 3");
		pessoaTeste.setTipoPessoa(TipoPessoa.FISICA);

		Pessoa pessoa1 = new Pessoa("Aluno 1", "Teste 1", 10, TipoPessoa.FISICA);
		Pessoa pessoa2 = new Pessoa("Aluno 2", "Teste 2", 20, TipoPessoa.JURIDICA);

		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.addPessoa(pessoa1);
		aluno.addPessoa(pessoa2);

		System.out.print("Aluno ID: " + aluno.getId());

	}

}
