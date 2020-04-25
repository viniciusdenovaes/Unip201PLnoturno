import java.util.TreeSet;

public class TesteTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Pessoa> pessoas = new TreeSet<>();
		
		pessoas.add(new Pessoa("123", "Ana"));
		pessoas.add(new Pessoa("123", "Bia"));
		pessoas.add(new Pessoa("124", "Cal"));
		pessoas.add(new Pessoa("120", "Dai"));
		pessoas.add(new Pessoa("121", "Fer"));
		pessoas.add(new Pessoa("110", "Ana"));
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa);
		}
		
	}

}
