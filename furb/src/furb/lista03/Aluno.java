package furb.lista03;

import java.util.List;

public class Aluno {

	private Integer id;
	private Integer matricula;
	private List<Pessoa> pessoas;
	private AlunoCartao alunoCartao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public List<Pessoa> getPessoa() {
		return this.pessoas;
	}

	public void addPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

	public AlunoCartao getAlunoCartao() {
		return alunoCartao;
	}

	public void setAlunoCartao(AlunoCartao alunoCartao) {
		this.alunoCartao = alunoCartao;
	}

}
