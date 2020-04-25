
public class Pessoa implements Comparable<Pessoa>{
	
	private String cpf;
	private String nome;
	
	public Pessoa(String aCpf, String aNome) {
		this.cpf = aCpf;
		this.nome = aNome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String aCpf) {
		this.cpf = aCpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}

	@Override
	public int compareTo(Pessoa outro) {
		// retorne positivo se this eh maior que outro
		// retorne negativo se this eh menor que outro
		// retorne zero     se this eh igual ao  outro
		return this.getCpf() .compareTo( outro.getCpf() );
	}
	
	@Override
	public boolean equals(Object outro) {
		
		// 1 verifica se eh o mesmo objeto
		if(this == outro) {
			return true;
		}
		
		// 2 verifica se o outro eh nulo
		if(outro==null) {
			return false;
		}
		
		// 3 verifica se eh um objeto da mesma classe
		/*
		if( ! (outro instanceof Pessoa) ) {
			return false;
		}
		*/
		if(this.getClass()!=outro.getClass()) {
			return false;
		}
		
		Pessoa outroPessoa = (Pessoa)outro;
		
		return this.getCpf() .equals( outroPessoa.getCpf() );
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	

}





