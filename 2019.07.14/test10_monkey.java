package day02_practic;

public class test10_monkey {
	public static int peach(int x) {
		
		if(x==1) {
			return 1;
		}else {
			return 2*(peach(x-1)+1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(peach(10));
	}
   
}
