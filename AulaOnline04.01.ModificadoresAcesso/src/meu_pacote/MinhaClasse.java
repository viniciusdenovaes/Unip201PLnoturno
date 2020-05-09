package meu_pacote;

//import meu_pacote.pacote_dentro_meu.ClasseDefaultOutroPacote;
import outro_pacote.ClasseDentroOutroPacote;
import outro_pacote.ClassePaiOutroPacote;


//______________________________________________________________
//|           │ Class │ Package │ Subclass │ Subclass │ World  |
//|           │       │         │(same pkg)│(diff pkg)│        |
//|───────────┼───────┼─────────┼──────────┼──────────┼────────|
//|public     │   +   │    +    │    +     │     +    │   +    | 
//|───────────┼───────┼─────────┼──────────┼──────────┼────────|
//|protected  │   +   │    +    │    +     │     +    │        | 
//|───────────┼───────┼─────────┼──────────┼──────────┼────────|
//|no modifier│   +   │    +    │    +     │          │        | 
//|───────────┼───────┼─────────┼──────────┼──────────┼────────|
//|private    │   +   │         │          │          │        |
//|___________|_______|_________|__________|__________|________|
// + : accessible         blank : not accessible
//

public class MinhaClasse extends ClassePaiOutroPacote{
	
	public int variavelPublic;
	protected int variavelProtected;
	int variavelDefault;
	private int variavelPrivate;
	
	public void teste() {
		
		this.variavelPublic = 1;
		this.variavelProtected = 1;
		this.variavelDefault = 1;
		this.variavelPrivate = 1;
		
		OutraClasse otrCls = new OutraClasse();
		otrCls.variavelPublic = 1;
		otrCls.variavelProtected = 1;
		otrCls.variavelDefault = 1;
		//otrCls.variavelPrivate = 1;
		
		super.variavelPublicPai = 1;
		super.variavelProtectedPai = 1;
		//super.variavelDefaultPai = 1;
		//super.variavelPrivatePai = 1;
		
		ClasseDentroOutroPacote clsOtrPct = new ClasseDentroOutroPacote();
		clsOtrPct.variavelPublic = 1;
		//clsOtrPct.variavelProtected = 1;
		//clsOtrPct.variavelDefault = 1;
		//clsOtrPct.variavelPrivate = 1;
		
		//ClasseDefaultOutroPacote clsDflOtrPct = new ClasseDefaultOutroPacote();
		
		
	}

}










