/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riverbank
 */
    import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		String calculation,answer ="yes";
		do {
			Scanner bulcky=new Scanner(System.in);

			System.out.println("enter first number");
			num1=bulcky.nextDouble();
			System.out.println("enter an operator(+,-,*,/)");
			char operator = bulcky.next().charAt(0);
			System.out.println("enter second number");
			num2=bulcky.nextDouble();

			double output=0;
			//String answer="yes";
			String Output="exit";

			switch (operator) {

			case '/':

				if ( 0 == num2 ) {

					System.out.println("divisor can not be 0");
					do {
						System.out.println("try again : enter second number");
						num2=bulcky.nextDouble();
					}while (num2==0);
					//System.out.println("to try again? press yes on continue ");
					output = num1 / num2;

				}

				else {

					output = num1 / num2;

				}




				break;

			case '+':
				output = num1 + num2;
				break;

			case '-':
				output = num1 - num2;
				break;

			case '*':
				output = num1 * num2;
				break;

			default:
				System.out.printf("You have entered wrong operator");
				return;
			}

			System.out.println(num1+" "+operator+" "+num2+": "+output);
			System.out.println("continue?yes or no");
			answer=bulcky.next();
		}while(answer.equals("yes"));
		System.out.println("program exited");

	}
}








    

