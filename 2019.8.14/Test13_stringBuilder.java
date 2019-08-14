package string;
/*
 * 12、在一个字符串“0”，循环十次。(使用stringBuilder，避免多次创建对象)
第一次：”01”
第二次: ”012”
第三次：”0123”
。。。。。。。
第十次：”012345678910”
注：输出最终结果的字符串
 */
public class Test13_stringBuilder {

	public static void main(String[] args) {
		//创建StringBuilder对象
		StringBuilder s=new StringBuilder("0");
		//循环10次，每次加 i
		for(int i=1;i<=10;i++) {
			s.append(i);
		}
		//转为String类型，然后输出
		System.out.println(s.toString());
	}

}
