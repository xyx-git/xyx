package homework;

import java.util.Scanner;

public abstract class test01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a =input.nextInt();
		switch (a/10) {
		case 10:
			System.out.println("A��");
			break;
		case 9:
			System.out.println("A��");
			break;
		case 8:
			System.out.println("B��");
			break;
		case 7:
			System.out.println("C��");
			break;
		case 6:
			System.out.println("D��");
			break;
		default:
			System.out.println("E��");
			break;
			
	}
	
	}
}