
public class TesteFuncao {
	
	
	public static void main(String[] args) {
		
		double raio = 1;
		double area = calcAreaCircunferencia(raio);
		
		System.out.println(area);
		
		System.out.println(calcAreaCircunferencia(2));
		
	}
	
	static double calcAreaCircunferencia(double raio) {
		double resultado = raio*raio*Math.PI;
		return resultado;
	}

}
