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
		//����С���ӵ�λ��
		Scanner input=new Scanner(System.in);
		int n=1;
		
		boolean e=true;
		do {
	System.out.println("ĿǰС����λ�ڣ�"+"("+x+","+y+")"+"\n"+
			"��ѡ���ܣ�"+"\n"
			+"1�������ƶ�һ����λ"+"\n"
			+"2�������ƶ�һ����λ"+"\n"
			+"3�������ƶ�__��"+"\n"
			+"4���Զ���λ��");
		int m=input.nextInt();		
		switch (m){
		case 1:
			x=x-1;
			break;
		case 2:
			x=x+1;
			break;
		case 3:
			System.out.println("��������Ҫ�����ƶ��ĸ���");
			int m1=input.nextInt();
			y=y+m1;
			break;
		case 4:	
			System.out.println("������X���꣺");
			x=input.nextInt();
			System.out.println("������Y���꣺");
			y=input.nextInt();
			break;
		}
		System.out.println("ĿǰС����λ��"+"("+x+","+y+")");
		
		System.out.println("�Ƿ��������y/n��");
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
		System.out.println("�붨��X����ķ�Χ��+"+"\n"+"�½磺");
		int m1=input.nextInt();
		System.out.println("�Ͻ磺");
		int m2=input.nextInt();
		
		System.out.println("�붨��Y����ķ�Χ��+"+"\n"+"�½磺");
		int n1=input.nextInt();
		System.out.println("�Ͻ磺");
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
