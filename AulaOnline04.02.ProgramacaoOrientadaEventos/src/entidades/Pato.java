package entidades;

import entidades.quack.QuackBehavior;
import entidades.voar.VoarBehavior;

public class Pato {
	
	private String nome;
	private QuackBehavior quackBehavior;
	private VoarBehavior voarBehavior;
	
	public Pato(String aNome) {
		this.nome = aNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void quack() {
		System.out.println("O pato " + getNome() + " vai falar: ");
		this.quackBehavior.quack();
	}
			
	public void setVoaBehavior(VoarBehavior voarBehavior) {
		this.voarBehavior = voarBehavior;
	}
	
	public void voa() {
		voarBehavior.voa();
	}
//	
//	public void setNadaBehavior() {}
//	
//	public void nada()??

}
