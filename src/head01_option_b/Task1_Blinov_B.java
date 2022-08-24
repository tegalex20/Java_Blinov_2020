   package head01_option_b;

//import java.io.NotActiveException; // what is it?
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet; // B.9
import java.util.Set; // B.9

import javax.print.DocFlavor.INPUT_STREAM;


public class Task1_Blinov_B {
	

	
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner ( System.in); 
		System.out.println ("How many numbers do you want to enter:");
		 int n = in.nextInt();
		
		 int[] mass = new int[n]; // input array
			Scanner scanner = new Scanner ( System.in);
			for (int i = 0; i < mass.length; i++) 
			{
				System.out.print ("Enter numbers " + i + " =");
				mass [i] = scanner.nextInt(); 
			}


		// ?.1 ???????? ?????? ? ???????? ?? ?????? ?????
		//TODO ???????? ????????????? ?????
			
	/*		System.out.println ();
			System.out.println( "Even and odd numbers:");
			 int[] mass1 = new int[n];
			 int[] mass2 = new int[n];
			for (int i = 0; i < mass.length; i++) {
				if ( mass[i]%2==0 ) {  //TODO ???????? ????????????? ?????
					mass1 [i] = mass[i];
					}
				else {
					mass2 [i] = mass[i];
					}
			}
			System.out.print( "Even numbers : " );
			for (int i = 0; i < mass1.length; i++) {
				if (mass1[i]>0) {
					System.out.print(  mass1 [i]+ ", " );}
				}
			System.out.println ();
			System.out.print( "Odd numbers : " );
			for (int i = 0; i < mass2.length; i++)
			 {
				if (mass2[i]>0) 
				{
					System.out.print(  mass2 [i]+ ", " );
				}
			 }
		*/
			
			
		//B.2
		/*	System.out.println ();
			System.out.println( "Max and min numbers");
			int max = mass[0], min = mass[0];
			for (int i = 0; i < mass.length; i++) {
				if (mass[i] > max)  
					max = mass[i];	
				if (mass[i] < min) 
					min = mass[i];
			}
					System.out.println ( "Max number = " + max );
					System.out.println( "Min number = " + min );  
		 */		
			
			
		//B.3   "Numbers that are divided by 3 or 9"
					//TODO ???????? ????????????? ?????
			
		/*	System.out.println ();
			 int[] mass3 = new int[n];
				for (int i = 0; i < mass.length; i++) {
					if ( mass[i]%3==0 || mass[i]%9==0) {  //TODO ???????? ????????????? ?????
						mass3 [i] = mass[i];
						}
					
				}
				  System.out.print( "Numbers that are divided by 3 or 9: " );
				for (int i = 0; i < mass3.length; i++) {
					if (mass3[i]>0) {
						System.out.print(  mass3 [i]+ ", " );
					}
			   	}	
		*/
			
				
		//B.4 "Numbers that are divided by 5 and 7"
				//TODO ???????? ????????????? ?????
				
		/*		System.out.println ();
				 int[] mass4 = new int[n];
					for (int i = 0; i < mass.length; i++) {
						if ( mass[i]%5==0 && mass[i]%7==0) {  //TODO ???????? ????????????? ?????
							mass4 [i] = mass[i];
							}
						
					}
					  System.out.print( "Numbers that are divided by 5 and 7: " );
					for (int i = 0; i < mass4.length; i++) {
						if (mass4[i]>0) {
							System.out.print(  mass4 [i]+ ", " );
						}
				   	}
		*/
			//B.5 " All three-digits"
			//TODO ???????? ????????????? ?????, ?????? ??? ?????? ? ?.6 -????? ????????? " ??? ????? ?????"
			
		/*		System.out.println ();
					 int[] mass5 = new int[n];
						for (int i = 0; i < mass.length; i++) {
							if (mass [i] >99 && mass[i] < 1000) {
								int a = mass [i]%10;
								int b = mass [i]/10%10;
								int c = mass [i]/100%10;
								  if (a!=b && a!=c) {
									mass5 [i] = mass[i];
									 
							    	}
							}
						}	
									System.out.print( " Three-digits: " );
									for (int i = 0; i < mass5.length; i++) {
										if (mass5[i]>0) {
											System.out.print(  mass5 [i]+ ", " );
										}
										//System.out.println("No such numbers");
									}	
			*/
						
			
			//B.6 Simple numbers
			
		    /*      	boolean condition = true;
							for (int i = 0; i < mass.length; i++) {	
							  if (mass[i]!=0 && mass[i]!=1) {	
								
								  for (int j = 2; j < mass[i]; j++) {
										if(mass[i]%j ==0) {
											condition = false;
											break;
										}
								  }
								  if (condition) {
									 System.out.println(condition ? (mass[i] + " ") : " ");
								  } 
							   }	
							}
							if (condition == false) {
								System.out.println ("No simple numbers");
							}
			*/					
							
		
			//B.7.1 sort numbers
			
			
							 
				for (int i = mass.length-1; i>0; i--) {
					for (int j = 0; j < i; j++) {
					   if (mass[j] > mass[j+1]) {
				     	//if (mass[j] < mass[j+1]) { 
					    // сортировка о уменьшению	
				         int  tmp7= mass[j];
					      mass[j]=mass[j+1];
				          mass[j+1]= tmp7;
					    }
					}	
				}
				//for (int i = 0; i < mass.length; i++) 
				//System.out.print(  mass [i]+ ", " );			
							
			System.out.println( "B.7 -Sort numbers:" + Arrays.toString(mass) ); 
	
			
			//B.7.2 sort numbers	
	/*       Arrays.sort(mass);
	       System.out.println("Sort numbers:" + Arrays.toString(mass) ); 
	      //for (int i = 0; i < mass.length; i++) 
			//System.out.print( mass [i]+ ", " );
	       
	       int temp;
	       for (int i = 0; i < n/2; i++) { // n/2 -?????? ?????? ?? ???????? ???????
			temp= mass[n-i-1];
			mass[n-i-1]= mass[i];
			mass[i]= temp;
		   }
	       System.out.println("Revers  sorting numbers:" + Arrays.toString(mass) ); 
	  */
			
			
			
		    // B.8 numbers in descending order	 
	/*		int[] counters = new int[mass.length];
			
			for (int i= 0; i< mass.length; i++) //??????????? ??????????? ?????????? ????????
			{
				counters[i]  = 0;
				for (int j= 0; j < mass.length; ++j)
				{
					if (mass[i] == mass[j]) {
						counters[i] +=1;
					}
				}
			}
			
			for (int i = 0; i < mass.length -1; ++i) { // ???????????? ? ???????
				for (int j = i+1 ; j < mass.length; ++j) {
					if (counters[j] > counters[i]) {
						int tmp = counters[i];
						counters[i] = counters[j];
						counters[j] = tmp;
						tmp = mass[i];
						mass[i] = mass[j];
						mass[j] = tmp;
					}
					else {
						if (counters[i] == counters[j] && mass[i] > mass[j])
						{
						int tmp = mass[i];
						mass[i] = mass[j];
						mass[j] = tmp;
						}
					}
				}
			 }
			System.out.println("\nNew mass numbers:" + Arrays.toString(mass) ); 
			System.out.println("counters[]"  + Arrays.toString(counters) );
			System.out.println("Number  Meets");
			for (int i = 0; i < mass.length; i += counters[i]) {
				System.out.println (mass[i] + "\t" + counters[i]);
			}
	*/
			
			
			
			//B.9  happy numbers
			//TODO ???????? ???? ??? ???????? ???? ????? ???????
			
	/*		 int[] mass9 = new int[n];
			for (int i = 0; i < mass.length; i++) {
				int temp9 = mass[i];
			    int flag = 1;
				 Set<Integer> unique_num = new HashSet<Integer>();
				while ( unique_num.add(temp9)) // ????????? ????????  ? HashSet  ? ??????? add
				{ 
					//System.out.println (unique_num); // ????????? ??? HashSet ????????????
				     int value =0;
					 while (temp9 >0)
					 {	 
						 value += Math.pow(temp9%10, 2); // temp9%10^2
					  	 temp9 /=10;
					 }
					 temp9 = value; 
					 if ( temp9==1)
					 {
						 flag=flag+1;
						 mass9 [i] = mass[i];
						 break;
					 }
				 }
			}
			//System.out.println(" Happy number : " + Arrays.toString(mass9) ); 
			System.out.print( " \nHappy number : " );
			for (int i = 0; i < mass9.length; i++)
			 {
				if (mass9[i]>0) 
				{
					System.out.print(  mass9 [i]+ ", " );
				}
			 }
	*/
	
			
			
			
			//B.10
			System.out.println( "\nB.10 palindrome numbers.");
			// TODO ??? ??????? ?????  Arrays.toString(mass10) ?? ??????? 0 ?? ?????? ?????? ???????
			
		/*	int temp10;
			int[] mass10 = new int[n];
			for (int i = 0; i < mass.length; i++) {
				temp10= mass[i];
				int sum10 = 0, a10;
				while ( temp10 > 0)
				  {
					a10= temp10%10;
					sum10 = (sum10*10)+a10; 
					temp10= temp10/10;
				  }
				    if (mass[i] == sum10)
			         	{		
						mass10 [i] = mass[i];
						}
				}
	         //	System.out.println("Palindrome numbers- " + Arrays.toString(mass10)); 
			
			    System.out.println("\nPalindrome numbers: ");
		       	for (int i = 0; i < mass10.length; i++) {
				if (mass10[i]>0) {
					System.out.print(  mass10 [i]+ ", " );}
				}	
		*/	
		       	
			
			
			
			//B.11 ????????, ??????? ????? ????????? ???????? ?????????
			 System.out.println("\nOll numbers:" + Arrays.toString(mass) ); 
				for (int i = 0; i < mass.length-2; i++) {
					if (((mass[i]) + (mass[i+2])) / 2 == mass[i+1])
					{
						System.out.println("??????? [" + (i+1) + "] ????? ????????? ???????? ????????? , ??? ???????? = " + mass[i+1]);
					}
				}
			
	}
}


