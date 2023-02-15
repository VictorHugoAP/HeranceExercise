package view;

import model.BusinessAccount;
import service.Menu;

public class MainProgram {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		BusinessAccount businessAccount = new BusinessAccount();
		businessAccount.setNumber(menu.readInteger("Type the number account: "));
		businessAccount.setHolder(menu.readString("Type the holder account: "));
		businessAccount.setLoanLimit(menu.readDouble("Type the loan limit: "));
		
		businessAccount.deposit(menu.readDouble("\nWhat value do you want deposit?"));
		businessAccount.loan(menu.readDouble("\nWhat loan value?"));
		
		System.out.println(businessAccount);
	}
}
