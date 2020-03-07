
public class TesteArray {
	
	public static void main(String[] args) {
		int[] a = new int[9];
		
		System.out.println("O array a tem tamanho " + a.length);
		for(int i=0; i<a.length; i++) {
			a[i] = i*i;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("o indice " + i + " tem valor a["+i+"]="+a[i]);
		}
		
	}

}
