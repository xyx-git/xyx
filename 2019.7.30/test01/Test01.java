package day07_test2;
import day07_test.Test01_Student;
public class Test01 {
    public static void main(String[] args) {
    	day07_test.Test01_Student t=new day07_test.Test01_Student();
		System.out.println("在不同包访问sex的结果："+t.getSex());
	}
}
