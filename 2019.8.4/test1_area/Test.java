package chapter8_area;
import java.util.Arrays;
public class Test {
	 double pr;//�ܳ�
	 double [] arr=new double [3];//���峤��Ϊ3��double������arr
	 
	 void maxAreaIs() {
		 	pr=50;//�����ܳ���С
	 		//����ת��	
			Area a1=new Circular();
			Area a2=new Square();
			Area a3=new Triangle();
			
			//�������������arr
			arr[1]=a1.area(pr);
			arr[0]=a2.area(pr);
			arr[2]=a3.area(pr);
			
			//�������С��������
			Arrays.sort(arr);
		
			//ƥ��arr[2]�е���ֵ
			if (arr[2]==a1.area(pr)) {
				System.out.println("Բ�ε�������");
				
			}else if (arr[2]==a2.area(pr)) {
				System.out.println("�����ε�������");
			}else if (arr[2]==a3.area(pr)) {
				System.out.println("����ֱ�������ε�������");
			}
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.maxAreaIs();
	}
	
//	  void ismax() {
//	  //������������m
//	  Area [] m=new Area[3];
//	  //����ת��
//	  m[0]=new Circular();
//	  m[1]=new Square();
//	  m[2]=new Triangle();
//	  //��ֵ������arr��
//	  arr[0]=m[0].area(pr);
//	  arr[1]=m[1].area(pr);
//	  arr[2]=m[2].area(pr);	
//		//ƥ���������һλ
//		switch (arr[2]) {
//		case m[0].area(pr):
//			System.out.println("Բ�ε�������");
//			break;
//		case m[1].area(pr):
//			System.out.println("�����ε�������");
//			break;
//		case m[2].area(pr):
//			System.out.println("����ֱ�������ε�������");
//			break;
//		}	
//}
	

}
