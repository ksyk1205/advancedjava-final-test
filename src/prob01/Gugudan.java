package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 ); //l = 1부터 9까지 랜덤
		int r = randomize( 1, 9 );//r = 1부터 9까지 랜덤
		
		resultNumber = l * r; // resultNumber은 l과 r을 곱한다

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize( 0, 8 ); 
		answerNumbers[ loc ] = resultNumber;
		//resultNumber이  배열 안에 랜덤으로 들어가게 한다
		
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		// 배열에 3칸이 차면 다음 줄로 내려주고 3칸이 아니면 tab해준다.
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			System.out.print( answerNumbers[ i ] );
		}
		System.out.print( "\n\n" );
		System.out.print( "answer:" );
		//answer값을 입력받아 resultNumber와 같으면 정답 아니면 오답
		Scanner s = new Scanner( System.in );
		int num =s.nextInt();
		if(num == resultNumber) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}
	//random에 1부터 9까지 ,배열에 랜덤으로 곱하여 들어가기 위해 곱할 숫자
	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {
		
		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		//boardNumbers의 배열이 [9]
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			//random에 1~9까지 
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if( boardNumbers[i]==random || random==resultNumber) {
	        		evaluted = true;
	        		break;
	        	}
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
}
