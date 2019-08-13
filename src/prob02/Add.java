package prob02;

public class Add implements Arithmetic {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public int calculate(int a, int b) {
		int result=a+b;
		return result;
	}






}
