
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
 * ������Ϊ��
 *          Base
 *          Chils
 * ��Ϊ��ʵ����Childʱ��Ĭ�ϵ���Child���޲ι��췽����
 * ��Base��Child�ĸ��࣬��Child���޲ι��췽����û����ʽ���ø����вι��췽����ϵͳ��Ĭ�ϵ������޲ι��췽��
 * 
 *
 * */
