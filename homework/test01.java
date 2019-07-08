package homework;

import java.util.Scanner;

public abstract class test01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a =input.nextInt();
		switch (a/10) {
		case 10:
			System.out.println("A级");
			break;
		case 9:
			System.out.println("A级");
			break;
		case 8:
			System.out.println("B级");
			break;
		case 7:
			System.out.println("C级");
			break;
		case 6:
			System.out.println("D级");
			break;
		default:
			System.out.println("E级");
			break;
			
	}
	
	}
}