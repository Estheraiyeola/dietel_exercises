import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", 100.00);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter amount to be withrawed from account2: ");
		double withdrawAmount= input.nextDouble();
		System.out.printf("%ndeducting %.2f from account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
	}
	
		

}
