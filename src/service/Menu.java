package service;

import java.util.Scanner;

import model.Account;
import model.BusinessAccount;

public class Menu {
	public Menu(){
	}
	
	public void showMainMenu(){
		Integer optionMainMenu = 0;
		do {
			System.out.println("New account, Choose what account type wish");
			System.out.println("1) Default Account \n2)Business Account");
			optionMainMenu = readInteger("Option: ");
			
			switch(optionMainMenu){
				case 1: Account account = new Account
						(readInteger("Type the account number: "), 
						readString("Type the holder name: "));
						System.out.println("Account created successfully");
						System.out.println("Withdrawal fee for Default account is 4.00");
						showDefaultAccountMenu(account);
						break;
						
				case 2: BusinessAccount bAccount = new BusinessAccount
						(readInteger("Type the account number: "), 
						readString("Type the holder name: "), 
						readDouble("Type the Loan limit: "));
						System.out.println("Business Account created successfully");
						System.out.println("Withdrawal fee for Business account is 6.00 and loan fee is 15.00");
						showBusinessMenu(bAccount);
						break;
						
				case 0: System.out.println("Leaving...");
						break;
				
				default:
					System.out.println("\nInvalid Option, choose a valid option");	
			}
		}while(optionMainMenu != 0);
	}
	
	public void showBusinessMenu(BusinessAccount bAccount) {
		Integer optionBusinessMenu = 0;
		
		do {
			System.out.println("\nBusiness Menu Options: ");
			System.out.println("1) Show account infos");
			System.out.println("2) Do with draw");
			System.out.println("3) Do deposit");
			System.out.println("4) Do loan");
			System.out.println("0) Back to main menu");
			optionBusinessMenu = readInteger("Option: ");
			
			switch(optionBusinessMenu) {
				case 1: System.out.println(bAccount.toString());; break;
				case 2: bAccount.withDraw(readDouble("What value to with draw?" )); break;
				case 3: bAccount.deposit(readDouble("What value to deposit?" )); break;
				case 4: bAccount.loan(readDouble("What value to loan?" )); break;
				case 0: System.out.println("\nReturning to the main menu...\n"); break;
				default: System.out.println("\nInvalid option");
			}
		}while(optionBusinessMenu != 0);
	}
	
	public void showDefaultAccountMenu(Account account) {
		Integer optionDefaultAccountMenu = 0;
		
		do {
			System.out.println("\nDefault account Menu Options: ");
			System.out.println("1) Show account infos");
			System.out.println("2) Do with draw");
			System.out.println("3) Do deposit");
			System.out.println("0) Back to main menu");
			optionDefaultAccountMenu = readInteger("Option: ");
			
			switch(optionDefaultAccountMenu) {
				case 1: System.out.println(account.toString());; break;
				case 2: account.withDraw(readDouble("What value to with draw?" )); break;
				case 3: account.deposit(readDouble("What value to deposit?" )); break;
				case 0: System.out.println("\nReturning to the main menu...\n"); break;
				default: System.out.println("\nInvalid option");
			}
		}while(optionDefaultAccountMenu != 0);
	}
	
	Scanner sc = new Scanner(System.in);
	public String readString(String text) {
		sc.nextLine();
		System.out.println(text);
		return sc.nextLine();
	}
	
	public Integer readInteger(String text) {
		System.out.println(text);
		return sc.nextInt();
	}
	
	public Double readDouble(String text) {
		System.out.println(text);
		return sc.nextDouble();
	}
}
