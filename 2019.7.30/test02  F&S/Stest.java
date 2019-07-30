package mark2;
/*
 * 在包mark2中创建类Stest的main方法中测试。
 * 在实例化S类前，其static块被调用一次。
 * 调用S类中的weight ，能否被修改????
 * 调用S类中的size，能否被修改????
 */
public class Stest {
	public static void main(String[] args) {
		S s=new S();
//		s.weight=20;   不能修改，因为weight被final修饰，只能被赋值一次
		S.size="S";  //可以修改，因为static修饰的变量不依赖任何对象，可以直接使用类名+.  访问
		s.size="M";  //也可以用对象名+.  访问
	}
}
