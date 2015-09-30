package paqBankSystem;

public class Client extends Person  {
	
	int numSucursal;
	private java.util.ArrayList<BankAccount> accounts;
	
	public Client (String initName, String initDateOfBirth, String initAddress, int initnumSucursal){
		super(initName, initDateOfBirth, initAddress);
		accounts = new java.util.ArrayList<BankAccount>();
		numSucursal = initnumSucursal;
	}

	public int getSucursal(){
		
		return numSucursal;
	}

	public void ingresarcuenta(BankAccount acc){
		
		accounts.add(acc);
	}
	
	public String toString(){
		
		String accs = "";
		
		accs = accs + super.toString() + " Suc: " + numSucursal + ": " ;
		
		for (BankAccount c:accounts) {
			accs += c.toString();
		}
		return accs;
		
	}
}
