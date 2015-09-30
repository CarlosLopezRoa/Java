package paqBankSystem;

public class BankAccount {

	String bankAccount; 
	double balance;
	
	public BankAccount (String initbankAccount, double initbalance) {
		
		bankAccount = initbankAccount;
		balance = initbalance;
	}
	
	public String toString (){
	
		return bankAccount + ": " + balance;
	}
	
} // Fin de la clase
