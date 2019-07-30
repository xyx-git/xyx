package mark1;
/*
 * 包mark1下创建类F，其中包含了成员变量:
 * sex常量  权限为public（公用）
 * age,height,name 权限为private（私有）
 * 成员方法：setAge() getName()
 */
public class F {
	public static final  String sex;
	private int age;
	private int height;
	private String name;


	public String getName() {
		return name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	
	

}
