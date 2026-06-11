package furb.lista03;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private Integer idade;
	private TipoPessoa tipoPessoa;

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sobrenome, Integer idade, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.tipoPessoa = tipoPessoa;
	}

	public Pessoa(String nome, String sobrenome,TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoPessoa = tipoPessoa;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
