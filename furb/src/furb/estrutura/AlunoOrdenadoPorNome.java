package furb.estrutura;

import java.util.Comparator;

public class AlunoOrdenadoPorNome implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
