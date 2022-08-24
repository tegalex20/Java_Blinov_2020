package head02_option_a;

import java.util.Scanner;

public class Glava2TaskA9 {

	public static void main(String[] args) {
		//TODO ??????? ???? ?,?,? ? ????????? ??????
				//A.9
				System.out.println( "\nA.9 Calculate square root ax2+bx+c=0.");

				Scanner value = new Scanner(System.in);
				System.out.print( "Enter the value 'a' : ");
				 //for (String str : args) // TODO ???????? ???  str  ?? ?
				double a = value.nextDouble();
				System.out.print( "Enter the value 'b' : ");
				 //for (String str : args) // TODO ???????? ???  str  ?? b
				double b = value.nextDouble();
				System.out.print( "Enter the value 'c' : ");
				 //for (String str : args) // TODO ???????? ???  str  ?? c
				double c = value.nextDouble();

				/** ?????????? ?????? ?? ???????, ????? ??????????? */
					double d = b*b - 4*a*c;
					if (d>0) {
						double x1 = (-b - Math.sqrt(d)) / (2*a);
						double x2 = (-b + Math.sqrt(d)) / (2*a);
						System.out.println( "Root equations: x1 = " + x1+ ", x2 = "+ x2);
					}
						else {
							if (d == 0) {
								double x;
								x = -b / (2*a);
								System.out.println( "The only root: x = " + x); 
							}
							    else {
					    	    System.out.println( "Equation does not have roots/"); 
						        }
					     }
				
			}
		}