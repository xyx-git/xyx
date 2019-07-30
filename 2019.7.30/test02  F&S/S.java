package mark2;
/*
 * 在包mark2下创建类S，能够继承类F。
 * 在该类中定义成员变量：
 * isSex 赋值为父类的常量sex。
 * weight 成员变量被final修饰。
 * size成员变量被static修饰。 
 * 在该类中定义static块，在类加载时能输出；“S类加载了！”
 */
import mark1.F;

public class S extends F {
	String sex=super.sex;
	final int weight=50;
	static String size;
	static {
		System.out.println("S类加载了");
	}
}
