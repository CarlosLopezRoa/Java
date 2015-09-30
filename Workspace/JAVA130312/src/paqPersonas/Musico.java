package paqPersonas;

public class Musico extends Persona{
	
	String instrumento;
	
	public Musico (String initNombre,String initFechaNac,String initInstrumento){
		
		super(initNombre,initFechaNac);
		instrumento = initInstrumento;
		
	}// Fin del constructor
	
	public String tocarInstrumento(){
		return "Tralalal lal la la -...";
	}
	
	public String toString(){
		
		return super.toString() + " " + this.instrumento + " " + this.tocarInstrumento();
	} 
}// Fin de la clase Musico
