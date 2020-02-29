
public class TesteEstruturaCondicional {
	
	public static void main(String[] args) {
		
		int numeroPlaca = 5;
		System.out.println("Placa " + numeroPlaca + " valida: " + verificaPlaca(numeroPlaca));
		
		numeroPlaca = -5;
		System.out.println("Placa " + numeroPlaca + " valida: " + verificaPlaca(numeroPlaca));
		
		numeroPlaca = 11234;
		System.out.println("Placa " + numeroPlaca + " valida: " + verificaPlaca(numeroPlaca));
		
		
		
		
	}
	
	static boolean verificaPlaca(int numeroPlaca) {
		boolean resposta;
		if(numeroPlaca>=0 && numeroPlaca<=9999) {
			resposta = true;
		} else {
			resposta = false;
		}
		return resposta;
	}

}
