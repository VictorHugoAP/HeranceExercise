package model;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
	}
	
	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 15.0;			
		}else {
			System.out.println("Transaction denied! Value greater than the limit");
		}
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", getNumber()=" + getNumber() + ", getHolder()="
				+ getHolder() + ", getBalance()=" + getBalance() + "]";
	}
}
