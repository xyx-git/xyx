package day02_practic;

import java.util.Scanner;

/*
 * 1������¼��ѧԱ������ѧ�֡�
 * ¼����Ϻ󣬹���ϵͳ���Զ��޸�ѧԱ�ɼ�,
 * ����60�����2�֡�Ҳ��������Ե�ѧԱ�ɼ���
 * 
 */
public class test01_Student {
     //����ѧ����
  static String [] name=new String[99999999];//����
  static double [] score=new double[99999999];//ѧ��
	//¼��
	public static void entry() {
		Scanner input=new Scanner(System.in);
		boolean judge=true;
		int i;
		//¼��ѧ�������ͷ���
		for(i=0;;i++) {
			System.out.print("������ѧ��������");
			name [i]=input.next();
			System.out.print("������ѧ��ѧ�֣�");
			score [i]=input.nextInt();
		 //�ж��Ƿ����¼��	
			System.out.println("�Ƿ�������룿��y/n)");
			String in=input.next();
			if ("y".equals(in)) {
				judge=true;
			}else {
				judge=false;
				break;
			}
		}
	}
	
	public static void add() {
		boolean no=true;
		int k;
		for (k=0;;k++) {
			if(score[k]<60 && name[k]!=null) {
				score[k]=score[k]+2;
			}
			if(name[k]!=null) {
				no=true;
			}else if (name[k]==null) {
				no=false;
				break;
			}
		}
	}
	
	public static void output() {
		System.out.println("����ѧ���ĳɼ����£�");
		for(int j=0;j<=99999999;j++) {
			if(name[j]!=null) {
			System.out.println("������"+name[j]+"\t"+"ѧ�֣�"+score[j]+"\n");
			}	else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		entry();
		add();
		output();
	}
	
	
}
