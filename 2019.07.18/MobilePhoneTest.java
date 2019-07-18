package day05_practice;

public class MobilePhoneTest{
	public static void main(String[] args) {
		MobilePhone mp=new MobilePhone();       //MobilePhone类被public修饰，在同一包中可以使用，不用导入
		mp.brand="苹果";                         //brand是MobilePhone类中的成员变量，它被public修饰，可以在同一包中访问、修改，此出将“苹果”赋值给brand
		String detail=mp.buy("发工资了");         //buy()使用public修饰，可以使用类名加“·”调用
		System.out.println(detail);
	}
}
