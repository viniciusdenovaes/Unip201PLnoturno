package entidades.quack;

public class QuackNormal implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("Quack!");
	}
}
