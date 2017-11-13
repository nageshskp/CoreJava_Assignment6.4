public class BankAtm  {

	
	int atmId;

	
	String bankName;

	
	String location;

		double balance=30000;

	

	BankAtm(int atmId, String bankName, String location,double balance) {

	

		this.atmId = atmId;

		this.bankName = bankName;

		this.location = location;
		
		this.balance=balance;


	}

	void withdraw(double amt) {

	
		if (this.balance-amt< 10000 || amt >this.balance ) {

	

			try {

				throw new BankATMException("Please maintain minimum balance of 10000. You don't have sufficiant balance");

			} catch (BankATMException e) {

				System.out.println(e);
	
			}

		} else {

			this.balance -= amt;
			System.out.println("Withdrawal Amount : " + amt +" ATM ID : " + this.atmId + "  Your Current Balance  : " + this.balance);

	
		}
	}
	void deposit(double amt) {

		this.balance += amt;
		System.out.println("Deposit Amount : " + amt +" ATM ID : " + this.atmId + "  Your Current Balance  : " + this.balance);

	}
}