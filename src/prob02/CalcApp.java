package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();

		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		String[] str = new String[3];
		str[0]=Integer.toString(a);
		str[1]=Integer.toString(b);
		str[2]=operation;

		switch(str[2]) {
		case"+":{
			Add add = new Add();

			int result =add.calculate(a, b);
			System.out.println(result);
			break;
		}
		case"-":{
			Sub sub = new Sub();

			int result =sub.calculate(a, b);
			System.out.println(result);
			break;
		}
		case"*":{
			Mul mul = new Mul();
	
			int result =mul.calculate(a, b);
			System.out.println(result);
			break;
		}
		case"/":{
			Div div = new Div();

			int result =div.calculate(a, b);
			System.out.println(result);
			break;
		}
		default:{
			System.out.println("지원하지 않는 연산입니다");
			break;
		}




		}
		scanner.close();
	}
}


