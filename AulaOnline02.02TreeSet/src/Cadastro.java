
public class Cadastro implements Comparable<Cadastro>{
	
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
	public int compareTo(Cadastro outro) {
		// return numero positivo se este é maior que o outro
		// return numero negativo se este é menor que o outro
		// return 0 se sao iguais
		
		if(!getNome().equals(outro.getNome())) {
			return getNome().compareTo(outro.getNome());
		}
		if(! (getIdade() == outro.getIdade()) ) {
			return Integer.compare(getIdade(), outro.getIdade());
		}
		
		return 0;
	}
	
	@Override
	public boolean equals(Object outro) {
		
		if( ! (outro instanceof Cadastro) )
			return false;
		
		Cadastro outroCadastro = (Cadastro)outro;
		
		if(! this.getNome().equals(outroCadastro.getNome()))
			return false;
		
		if(! (this.getIdade() == outroCadastro.getIdade()) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", idade=" + idade + "]";
	}


}
