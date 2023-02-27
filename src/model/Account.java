package model;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		this.balance = 0.0;
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0.0;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withDraw(Double amount) {
		Double taxDefaultAccount = 4.00;
		if(amount + taxDefaultAccount > balance) {
			System.out.println("insufficient funds! remember, fee for business account is " + taxDefaultAccount);
		}else {
			this.balance -= amount + taxDefaultAccount;			
			System.out.println("successful withdrawal");
		}
	}
	
	public void deposit(Double amount) {
		if(amount <= 0.0) {
			System.out.println("Invalid value");
		}else {
			this.balance += amount;
			System.out.println("successful deposit, your new balance is " + this.balance);			
		}
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
}
