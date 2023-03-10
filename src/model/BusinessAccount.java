package model;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		this.balance = 0.0;
	}
	
	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.loanLimit = loanLimit;
		super.balance = 0.0;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		if(loanLimit <= 0.0) {
			System.out.println("Invalid loan limit");
		}else {
			this.loanLimit = loanLimit;			
		}
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 15.0;			
		}else {
			System.out.println("Transaction denied! Value greater than the limit");
		}
	}
	
	@Override
	public void withDraw(Double amount) {
		Double taxBusinessAccount = 6.00;
		if(amount + taxBusinessAccount > balance) {
			System.out.println("insufficient funds! remember, fee for business account is " + taxBusinessAccount);
		}else {
			this.balance -= amount + taxBusinessAccount;			
			System.out.println("successful withdrawal");
		}
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", getNumber()=" + getNumber() + ", getHolder()="
				+ getHolder() + ", getBalance()=" + getBalance() + "]";
	}
}
