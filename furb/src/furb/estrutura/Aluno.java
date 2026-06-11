package furb.estrutura;

public class Aluno implements Comparable<Aluno>{

	private Long matricula;
	private String nome;
	private String sobrenome;

	public Aluno(Long matricula, String nome, String sobrenome) {
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	@Override
	public String toString() {
		return "Aluno: " + getNome() + " " + getSobrenome() 
				+ " Matricula: " + getMatricula();
	}

	@Override
	public int compareTo(Aluno objAluno) {
		return this.matricula.compareTo(objAluno.getMatricula());
	}
}
