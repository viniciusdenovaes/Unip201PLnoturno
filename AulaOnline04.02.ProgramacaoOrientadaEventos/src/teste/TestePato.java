package teste;

import entidades.Pato;
import entidades.quack.QuackMudo;
import entidades.quack.QuackNormal;
import entidades.voar.VoaSuperAlto;
import entidades.voar.VoarBehavior;

public class TestePato {
	
	public static void main(String[] args) {
		
		Pato patoNormal = new Pato("Pato Normal");
		patoNormal.setQuackBehavior(new QuackNormal());
		patoNormal.setVoaBehavior(new VoaSuperAlto(false));
		patoNormal.quack();
		patoNormal.voa();
		System.out.println();
		
		Pato patoDeMadeira = new Pato("Pato de Madeira");
		patoDeMadeira.setQuackBehavior(new QuackMudo());
		patoDeMadeira.setVoaBehavior(
				new VoarBehavior() {
					@Override 
					public void voa() {
						System.out.println("Nuca voa");
					}
				});
		patoDeMadeira.quack();
		patoDeMadeira.voa();
		
		System.out.println();
		
	}

}



