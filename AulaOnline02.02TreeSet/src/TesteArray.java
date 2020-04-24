
public class TesteArray {
	
	public static void main(String[] args) {
		
		Cadastro[] cadastros = new Cadastro[4];
		
		cadastros[0] = new Cadastro("Ana", 1);
		cadastros[1] = new Cadastro("Bia", 2);
		cadastros[2] = new Cadastro("Carla", 3);
		cadastros[3] = new Cadastro("Day", 4);
		
		for(int i=0; i<cadastros.length; i++) {
			System.out.println(
					"na posicao " + i + " cadastro eh " + cadastros[i]);
		}
		
		System.out.println("Usando for each");
		
		for(Cadastro cadastro : cadastros) {
			System.out.println(cadastro);
		}
		

		
	}
	
}
