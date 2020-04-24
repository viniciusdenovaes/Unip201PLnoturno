import java.util.TreeSet;

public class TesteTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Cadastro> cadastros = new TreeSet<Cadastro>();
		
		Cadastro c1 = new Cadastro("Ana", 1);
		Cadastro c2 = new Cadastro("Ana", 1);
		Cadastro c3 = new Cadastro("Aba", 1);
		Cadastro c4 = new Cadastro("Cna", 1);
		Cadastro c5 = new Cadastro("Ana", 2);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c3));
		System.out.println(c1.compareTo(c4));
		System.out.println(c1.compareTo(c5));
		
		cadastros.add(new Cadastro("Ana", 1));
		cadastros.add(new Cadastro("Bia", 2));
		cadastros.add(new Cadastro("Carla", 3));
		cadastros.add(new Cadastro("Day", 4));
		cadastros.add(c1);
		cadastros.add(c2);
		cadastros.add(c3);
		cadastros.add(c4);
		cadastros.add(c5);
		
		for(Cadastro c : cadastros) {
			System.out.println(c);
		}
		
		
	}

}
