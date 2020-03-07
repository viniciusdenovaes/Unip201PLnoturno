
public class TesteVerificaPrimo {
	
	public static void main(String[] args) {
		int n = 30;
		for(int i=1; i<=n; i++) {
			boolean resposta = isPrimo(i);
			System.out.println("Numero " + i + " eh primo? " + resposta);
		}
		
	}
	
	static boolean isPrimo(int numero) {
		if(numero == 1) return false;
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}

}
