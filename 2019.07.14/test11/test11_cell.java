package day02_practic;

import day02_teach.test09_cell;

public class test11_cell { //����������
   
	int x;
	int y;
	public  test11_cell(int x1,int y1) {
		 x=x1;
		 y=y1;
	}
	//���ƶ�һ��λ
	public void leftMove() {
		x--;
	}
	
	//���ƶ�һ����λ
	public void rightMove() {
		x++;
	}
	
	//�����ƶ�һ����λ
	public void drop() {
		y++;
	}
	
	//�����ƶ�n����λ
	public void drop(int n) {
		y+=n;
	}
	
	//����ʾ�����Լ���ǰ������
	public void showInfo() {
		System.out.println("���ӵ�ǰ���꣺("+x+","+y+")  ");
	}
}	
	