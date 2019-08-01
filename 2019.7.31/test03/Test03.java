package chapter7_3;
/*
 *  
 */
public class Test03 {
	public static void main(String[] args) {
		Phones p=new Iphone();
		p.call();
		p=new Aphone();
		p.call();
		p=new Wphone();
		p.call();
	}
}
