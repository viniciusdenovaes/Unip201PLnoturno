import java.util.ArrayList;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
		
		cadastros.add(new Cadastro("Ana", 1));
		cadastros.add(new Cadastro("Bia", 2));
		cadastros.add(new Cadastro("Carla", 3));
		cadastros.add(new Cadastro("Day", 4));
		
		System.out.println(cadastros.get(0));
		System.out.println(cadastros.get(1));
		System.out.println(cadastros.get(2));
		System.out.println(cadastros.get(3));
		
		System.out.println("For tradicional");
		for(int i=0; i<cadastros.size(); i++) {
			System.out.println(
					"na posicao " + i + " elemento: " + cadastros.get(i));
		}
		
		System.out.println("For each");
		for(Cadastro c: cadastros) {
			System.out.println(c);
		}
		
		
	}

}
