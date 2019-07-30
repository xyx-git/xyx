package day07_test;
/*
 * 建立Student类
 * 定义sex属性，并用protected修饰
 */
public class Test01_Student {
	protected String sex="男";

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		Test01_Student s=new Test01_Student();
		System.out.println("在本类中访问结果："+s.sex);
	}
}



