package head02_option_a;

import java.util.Scanner;

public class Glava2TaskA8 {

	public static void main(String[] args) {
		
	//TODO ?????? ?? ???????? ? ????? Glava2TaskA, ????? ?????? A.7
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter:");
		int n = in.nextInt();

		/** ???? ????????? ??????? */
		System.out.println();
		int[] mass1 = new int[n]; // input array
		Scanner scanner1 = new Scanner(System.in);
		for (int i = 0; i < mass1.length; i++) {
			System.out.print("Enter numbers " + i + " =");
			mass1[i] = scanner1.nextInt();
		}
		
		//A.8
		System.out.println( "\nA.8 palindrome numbers.");
		/*
		 * *
		 */
		
		int temp8;
		int[] mass8 = new int[n];
		
		/**????????? ????? ?????? ?? ????? ? ????????? ??? ????? ?? ?????*/
		for (int i = 0; i < mass1.length; i++) {
			temp8= mass1[i];
			int sum8 = 0, a10;
			while ( temp8 > 0)
			  {
				a10= temp8%10;
				sum8 = (sum8*10)+a10; 
				temp8= temp8/10;
			  }
			
			/**??????????? ?????? ?????? mass8 ????? ??????????*/
			    if (mass1[i] == sum8)   
		         	{		
					mass8 [i] = mass1[i];
					}
			}
         	//System.out.println("Palindrome numbers- " + Arrays.toString(mass8)); 
		
		   /**?? ?????? ?????? mass8 ???????? ?????? ????? ?????????*/
         	int flag82=0;
	       	for (int i = 0; i < mass8.length; i++) {
	       		  if (mass8[i]>0) {
				    flag82++;
				    if (flag82==2) {
				    	System.out.print("Second palindrome numbers: ");
				     	System.out.print(  mass8 [i]+ ", " );
				    }
				    
				   }
			 }	
	       	
		
		
		
	}
}
	
		
		