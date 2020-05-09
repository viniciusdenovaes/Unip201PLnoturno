package entidades.voar;

public class VoaSuperAlto implements VoarBehavior{
	
	private boolean isSuperPato;
	
	public VoaSuperAlto(boolean isSuperPato) {
		this.isSuperPato = isSuperPato;
	}

	@Override
	public void voa() {
		if(isSuperPato) {
			System.out.println("Voa Super ALto na velocidade da luz");
		}
		else {
			System.out.println("Voa Alto e cai");
		}
	}
	

}
