import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TesteTreeMap {
	
	public static void main(String[] args) {
		
		int a = 1;
		Integer b = 1;
		double c = 1.0;
		Double d = 1.0;
		char e = 'm';
		Character f = 'm';
		boolean g = true;
		Boolean h = true;
		
		TreeMap<Integer, Pessoa> cpf_pessoas = new TreeMap<Integer, Pessoa>();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa(123, "Ana"));
		pessoas.add(new Pessoa(123, "Bia"));
		pessoas.add(new Pessoa(124, "Cal"));
		pessoas.add(new Pessoa(120, "Dai"));
		pessoas.add(new Pessoa(121, "Fer"));
		pessoas.add(new Pessoa(110, "Ana"));
		
		for(Pessoa pessoa: pessoas) {
			cpf_pessoas.put(pessoa.getCpf(), pessoa);
		}
		
		System.out.println(cpf_pessoas.get(123));
		
		System.out.println("Todas as pessoas:");
		for(int cpf: cpf_pessoas.keySet()) {
			System.out.println( cpf_pessoas.get(cpf) );
		}
		
		System.out.println( cpf_pessoas.getOrDefault(  0, new Pessoa(0, "nao existo")) );
		System.out.println( cpf_pessoas.getOrDefault(123, new Pessoa(0, "nao existo")) );
		System.out.println( cpf_pessoas.getOrDefault(110, new Pessoa(0, "nao existo")) );
		System.out.println( cpf_pessoas.getOrDefault(111, new Pessoa(0, "nao existo")) );
		
		
		
	}

}
