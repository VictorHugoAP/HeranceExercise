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
		this.balance -= amount;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
}
