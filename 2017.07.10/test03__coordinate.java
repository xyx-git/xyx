package day02_practic;

import java.util.Scanner;

public class test03__coordinate {
    
	static int x=0;
	static int y=0;
	
	int [] coorx=new int [9];
	int [] coory=new int [19];
	public static  void assignment() {
		test03__coordinate test1=new test03__coordinate();
		for(int i=0;i<test1.coorx.length ;i++) {
			test1.coorx[i]=i;
		}
		for(int j=0;j<test1.coory.length ;j++) {
			test1.coorx[j]=j;
		}
	}
	public static void assignment2() {
		//定义小格子的位置
		Scanner input=new Scanner(System.in);
		int n=1;
		
		boolean e=true;
		do {
	System.out.println("目前小格子位于："+"("+x+","+y+")"+"\n"+
			"请选择功能："+"\n"
			+"1、向左移动一个单位"+"\n"
			+"2、向右移动一个单位"+"\n"
			+"3、向下移动__格"+"\n"
			+"4、自定义位置");
		int m=input.nextInt();		
		switch (m){
		case 1:
			x=x-1;
			break;
		case 2:
			x=x+1;
			break;
		case 3:
			System.out.println("请输入需要向下移动的格数");
			int m1=input.nextInt();
			y=y+m1;
			break;
		case 4:	
			System.out.println("请输入X坐标：");
			x=input.nextInt();
			System.out.println("请输入Y坐标：");
			y=input.nextInt();
			break;
		}
		System.out.println("目前小格子位于"+"("+x+","+y+")");
		
		System.out.println("是否继续？（y/n）");
		String m2=input.next();
		if("y".equals(m2)) {
			e=true;
		}else {
			e=false;
		}
		}while(e==true);
	}
	
	
	public static void paper() {
		Scanner input=new Scanner(System.in);
		System.out.println("请定义X坐标的范围：+"+"\n"+"下界：");
		int m1=input.nextInt();
		System.out.println("上界：");
		int m2=input.nextInt();
		
		System.out.println("请定义Y坐标的范围：+"+"\n"+"下界：");
		int n1=input.nextInt();
		System.out.println("上界：");
		int n2=input.nextInt();
		
		int [] paper1=new int[m2-m1+1];
		int j=m1;
		for(int i=0;i<m2-m1;i++) {
			paper1[i]=j;
			j++;
		}
		
		int [] paper2=new int[n2-n1+1];
		int j1=n1;
		for(int i1=0;i1<n2-n1;i1++) {
			paper2[i1]=j1;
			j1++;
		}
		
		for (int yy=0;yy<paper2.length;yy++) {
			for(int xx=0;xx<paper1.length;xx++) {
				if (x==xx && y==yy) {
					System.out.print("#"+"\t");
				}else {
				System.out.print("-"+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 assignment2();
		paper();
	}
	
}
