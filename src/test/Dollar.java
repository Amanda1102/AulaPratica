package src.test;

public class Dollar extends Money{
	Dollar(int amount) {
		this.amount= amount;
	}
	void times(int multiplier) {
		amount= amount * multiplier;
	}
}
