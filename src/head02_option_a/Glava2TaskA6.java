package head02_option_a;

import java.util.Scanner;

public class Glava2TaskA6 {

	public static void main(String[] args) {

		//TODO ?????? ?? ???????? ? Glava2TaskA
		//A.6.
		/** ????? , ????? ? ?????? ???? ? ??????? ??????? ???????????*/

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
		int flag6 = 0;
		int tmp6 = 0;
		for (int i = 0; i < mass1.length; i++) {
			if (flag6 > 0) {
				continue;
			}
			/**  ????? ?????? ????????? ?? ????? */
			tmp6 = mass1[i];
			int last = tmp6 % 10;
			tmp6 /= 10;
			while (tmp6 != 0) {
				/** ??????? ????? ? ??????? ????????? ????? ?????? ????????????? */
				if (last <= tmp6 % 10) {
					// System.out.println(" ����� � ������ :"+ i +
					//  " ?? ????????");
					break;
				} else {
					last = tmp6 % 10;
					tmp6 /= 10;
					/**
					 * ???? ??? ????? ?????? ?????????? ??????? ????? ? ????
					 * ?????? ? ?????????? ??????
					 */
					if (tmp6 == 0) {
						flag6++;
						System.out.println("\nA.6- The first number = "
								+ mass1[i]);
					}
				}
			}
		}

	

	}

}
