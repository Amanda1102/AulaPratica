package src.test;

abstract class Money {
	private String currency;
	
	protected int amount;

	static Money dollar(int amount)  {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
}
