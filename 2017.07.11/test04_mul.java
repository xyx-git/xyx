package day02_practic;
/*
 * 4、在控制台输出九九乘法表（依据二维数组提供循环变量）
 */
public class test04_mul {
	
int[][] org=new int[][]{{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
	
  public void mul() {
	  
	  for(int i=0;i<org[0].length;i++) {
		  for(int j=0;j<org[1].length;j++) {
			 if(j<=i) {
				 System.out.print(org[0][i]+"*"+org[1][j]+"="+(org[0][i])*(org[1][j])+" ");
			 }
		  }
		  System.out.println();
	  }
  }
  
  public static void main(String[] args) {
	  test04_mul a=new  test04_mul();
	  a.mul();
}
  
}
