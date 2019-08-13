package prob03;

public class Money {
	private int amount;
	public Money(int i) {
		this.amount=i;
	}
	public Money add(Money three) {
		Money money=new Money(amount+three.amount);
		return money;
	}
	public Money minus(Money two) {
		Money money=new Money(amount-two.amount);
		return money;
	}
	public Money multiply(Money two) {
		Money money=new Money(amount*two.amount);
		return money;
	}
	public Money devide(Money five) {
		Money money=new Money(amount/five.amount);
		return money;
	}
	public boolean equals(Object object){
		return object instanceof Money && ((Money)object).amount == amount ;
		
		
	}
}
