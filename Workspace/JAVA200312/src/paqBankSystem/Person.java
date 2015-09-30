package paqBankSystem;

public abstract class Person {

	private String Name;
	private String DateOfBirth;
	private String Address;
	
	public Person (String initName, String initDateOfBirth, String initAddress ){
		Name = initName;
		DateOfBirth = initDateOfBirth;
		Address = initAddress;	
	}
	
	public String getName(){
		return Name;
	}
	
	public String toString(){
		return Name+ "\t " + DateOfBirth + "\t " + Address;
	}
	
	public abstract int getSucursal();
	
} // Fin de la clase Person
