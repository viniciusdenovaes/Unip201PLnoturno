
public class TesteEstruturaCondicionalBooleanos {
	
	public static void main(String[] args) {
		String letrasPlaca = "oiu";
		int numerosPlaca = 456;
		
		System.out.println("Placa " + letrasPlaca + " " + numerosPlaca
				+ " eh " + verificaPlaca(numerosPlaca, letrasPlaca));
		
		letrasPlaca = "oiuo";
		numerosPlaca = 456;
		System.out.println("Placa " + letrasPlaca + " " + numerosPlaca
				+ " eh " + verificaPlaca(numerosPlaca, letrasPlaca));
		
		letrasPlaca = "iuo";
		numerosPlaca = 44456;
		System.out.println("Placa " + letrasPlaca + " " + numerosPlaca
				+ " eh " + verificaPlaca(numerosPlaca, letrasPlaca));
		
		
		
	}
	
	static boolean verificaPlaca(int numeroPlaca, String letrasPlaca) {
		boolean resposta;
		
		boolean isNumerosValidos = verificaNumeroPlaca(numeroPlaca);
		boolean isLetrasValidas = verificaLetrasPlaca(letrasPlaca);
		
		if(isNumerosValidos && isLetrasValidas) {
			resposta = true;
		} else {
			resposta = false;
		}
		
		return resposta;
	}
	
	static boolean verificaNumeroPlaca(int numeroPlaca) {
		boolean resposta;
		if(numeroPlaca>=0 && numeroPlaca<=9999) {
			resposta = true;
		} else {
			resposta = false;
		}
		return resposta;
	}
	
	static boolean verificaLetrasPlaca(String letras) {
		boolean resposta;
		if(letras.length()==3) {
			resposta = true;
		} else {
			resposta = false;
		}
		return resposta;
	}



}
