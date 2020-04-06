
public class Cadastro {
	
	private String nome;
	private int idade;
	
	public Cadastro(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", idade=" + idade + "]";
	}
	

}
