package head02_option_b;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;


public class Chernovik {
	
	
	public static void main(String[] args) {
		
		//B.9 ????????? ?????? ???????? ??????
		
					
		System.out.println( "\nB.9 - The program displays the name of the month by its number ");
		int number9;
		do {
		
		 Scanner numMonth = new Scanner(System.in);
		 System.out.println("Enter the month number : ");
		 number9 = numMonth.nextInt();
		
		/** ????? ???????? ?????? ?? ??????*/
		switch (number9) {
		case 12:
			System.out.println( "You introduced " + number9+ " month, it corresponds to December. ");
			break;
		case 11:
			System.out.println( "You introduced " + number9+ " month, it corresponds to November. ");
			break;
		case 10:
			System.out.println( "You introduced " + number9+ " month, it corresponds to October. ");
			break;
		case 9:
			System.out.println( "You introduced " + number9+ " month, it corresponds to September. ");
			break;
		case 8:
			System.out.println( "You introduced " + number9+ " month, it corresponds to August. ");
			break;
		case 7:
			System.out.println( "You introduced " + number9+ " month, it corresponds to July. ");
			break;
		case 6:
			System.out.println( "You introduced " + number9+ " month, it corresponds to June. ");
			break;
		case 5:
			System.out.println( "You introduced " + number9+ " month, it corresponds to May. ");
			break;
		case 4:
			System.out.println( "You introduced " + number9+ " month, it corresponds to April. ");
			break;	
		case 3:
			System.out.println( "You introduced " + number9+ " month, it corresponds to March. ");
			break;
		case 2:
			System.out.println( "You introduced " + number9+ " month, it corresponds to February. ");
			break;
		case 1:
			System.out.println( "You introduced " + number9+ " month, it corresponds to January. ");
			break;	

		default:
			System.out.println( "You have entered a wrong number. ");
			break;
		}
	  }
		while (number9 >12);
	}
}
