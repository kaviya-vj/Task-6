package java.org;

import java.util.Scanner;

public class Account {
	 static float bal,amt;
	Scanner scanner = new Scanner(System.in);
	//default constructor
	Account() {
		System.out.print("Enter the passenger id of depositor : ");
		int id = scanner.nextInt();	
	}
	//Parameterized constructor
	Account(float bal, float amt) {
		//deposit amount assigned to bal variable
		System.out.print("Enter the amount to deposit : ");
		 bal = scanner.nextFloat();
		//deposit method is given call
		 deposit(bal);
		 //display method is given call to display the current balance
		 display(bal);
		 //withdraw amount had been assigned to amt variable
		System.out.print("Enter the amount for withdraw: ");
		 amt = scanner.nextFloat();
		 //withdraw method is given call to calculate the withdrawal
		 withDraw(bal, amt);
	}
	public void deposit(float bal) {
		//balance is added
		bal ++;
	}
	public void withDraw(float bal, float amt) {
		//if condition is used to check whether the balance is greater than withdrawal amount
		if (bal >= amt){
			bal= bal - amt;
			System.out.println("You withdraw : "+amt);
		} else {
			//if the balance is less than withdraw we will get the Amount is insufficient 
			System.out.println("\nAmount is insufficient");
		}
		//display method is given call to display the balance after withdrawal
		display(bal);
	}
	public void display(float bal) {
		//to display the amount present in account
		System.out.println("Current balance : "+bal);
	}
	
	public static void main(String[] args) {
		//Default constructor
		Account acc1 = new Account();
		//parameterized constructor
		Account acc2 = new Account( bal, amt);
		
	}
}