
package chapter7_1;

class Base{	
	public Base() {
		System.out.println("Base");
	}
}
class Child extends Base {
	public Child () {
		System.out.println("Child");
	}
}

public class Sample{
	public static void main(String[] args) {
		Child c=new Child();
	}
}


/*
 * 输出结果为：
 *          Base
 *          Chils
 * 因为在实例化Child时会默认调用Child的无参构造方法；
 * 而Base是Child的父类，在Child的无参构造方法中没有显式调用父类有参构造方法，系统会默认调用其无参构造方法
 * 
 *
 * */
