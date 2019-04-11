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

public class StudentsGrade {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bulcky = new Scanner(System.in);
		int java, cplus, python, webdevelopment, c_hash;
		String name;
		String exit = "exit";
		String marks;
		int average, x = 0;
		do {
			System.out.println("enter your name");
			name = bulcky.next();
			do {
				System.out.println("java marks=");
				java = bulcky.nextInt();
			} while (java >= 100);
			do {
				System.out.println("python marks=");

				python = bulcky.nextInt();
			} while (python >= 100);
			do {
				System.out.println("c_hash marks=");
				c_hash = bulcky.nextInt();
			} while (c_hash >= 100);
			do {

				System.out.println("cplus marks=");
				cplus = bulcky.nextInt();
			} while (cplus >= 100);

			do {
				System.out.println("webdevelopment marks=");
				webdevelopment = bulcky.nextInt();
			} while (webdevelopment >= 100);

			average = (java + cplus + python + webdevelopment + c_hash) / 5;
			System.out.println("your average is " + average);
			if (average >= 50) {
				System.out.println(name + "\t"+" your grade is pass");

			} else if (average >= 100) {
				System.out.println("you've entered wrong values");
			} else if (average < 50) {
				System.out.println(name +"\t"+ " your grade is fail");
				x++;

			}

			System.out.println("Type 'exit' to exit the program");
			name = bulcky.next();
		} while (!name.equals("exit"));

		System.out.println("Program exited");

//		}
	}
}

    

