package chapter7_2;

public class Test02 {
	public static void main(String[] args) {
		Animal an=new Bird();
		an.printInfo();
		System.out.println();
		an=new Fish();
		an.printInfo();
	}
}
