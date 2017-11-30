package design.cards;

public enum CardValue {
	
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7);

	int value;
	
	CardValue(int val) {
		this.value = val;
	}
}
