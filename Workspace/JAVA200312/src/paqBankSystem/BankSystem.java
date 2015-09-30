package paqBankSystem;

public class BankSystem {

	public static void main(String[] args) {
	
		System.out.println("====Sistema Bancario====\n\n");
		
		Client cli01 = new Client("Humberto", "15/07/1990", "Hidalgo 70",105);
		Client cli02 = new Client("Leticia", "19/03/1900", "Morelos 180",1);
		BankAccount cu01 = new BankAccount("BAN0001",1000);
		BankAccount cu02 = new BankAccount("BAN0002",400);
		BankAccount cu03 = new BankAccount("BAN0003",10);

		cli01.ingresarcuenta(cu01);
		cli01.ingresarcuenta(cu03);
		cli02.ingresarcuenta(cu02);
		
		System.out.println(cli01.toString());
		System.out.println(cli02.toString());



	}
	
}// Fin de la clase 
