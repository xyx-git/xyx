package chapter9_carCental;
/*
 * ��������ϵͳ��ʵ���⳵���ܣ����������
 */
import java.util.Scanner;

public class CarBusiness  {
	static int day;    //�⳵ʱ��	
	
	public static void main(String[] args) {		
	
		//��������
		Automobile []arr=new Automobile [8];
		arr[0]=new Car("���","��NT37465",300,"������");
		arr[1]=new Car("���","��NT96968",600,"GL8");
		arr[2]=new Car("����","��NY28588",800,"X6");
		arr[3]=new Car("����","��CNY3284",600,"550i");
		arr[4]=new Bus("��","��6566754",800,16);
		arr[5]=new Bus("��","��9696996",1500,34);
		arr[6]=new Bus("����","��8696997",800,16);
		arr[7]=new Bus("����","��8696998",1500,34);					
				
		//ͨ��ϵͳ¼��ѡ���Ӧ�ĳ���
		Scanner input =new Scanner(System.in);					
		int chooseKind=0;//ѡ������
		int chooseBrand = 0;//ѡ��Ʒ��
		int chooseType=0;//ѡ������
		int day=0;//�⳵ʱ��
		
		System.out.println("***********��ӭ�����ڷ������������޹�˾***********\n1���γ�\t2���ͳ�");	
		System.out.print("��ѡ������Ҫ���޵��������ࣺ\t");
		 chooseKind=input.nextInt();
		if (chooseKind==1) {
			System.out.print("��ѡ������Ҫ�����޵�����Ʒ�ƣ�1����� \t2������\t");
			chooseBrand=input.nextInt();
			if (chooseBrand==1) {
				System.out.print("����ѡ������Ҫ���޵��������ͣ�1����������� \t 2�����GL8\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����NT37465");
				}else if(chooseType==2) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����NT96968");
				}else {
					System.out.print("�������󣬳��������ллʹ�ã�");
					System.exit(1);
				}
			}else if(chooseBrand==2){
				System.out.print("����ѡ������Ҫ���޵��������ͣ�1������X6 \t 2������550i\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����NY28588");
				}else if(chooseType==2) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����CNY3284");
				}else {
					System.out.print("�������󣬳��������ллʹ�ã�");
					System.exit(1);
				}
			}else {
				System.out.print("�������󣬳��������ллʹ�ã�");
				System.exit(1);
			}
		}else if(chooseKind==2) {
			System.out.print("��ѡ������Ҫ�����޵�����Ʒ�ƣ�1����\t 2������\t");
			chooseBrand=input.nextInt();
			if (chooseBrand==1) {
				System.out.print("����ѡ������Ҫ���޵��������ͣ�1��16�� \t 2��34��\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����6566754");
				}else if(chooseType==2) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����9696996");
				}else{
						System.out.print("�������󣬳��������ллʹ�ã�");
						System.exit(1);
				}
			}else if(chooseBrand==2){
				System.out.print("����ѡ������Ҫ���޵��������ͣ�1��16�� \t 2��34��\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����8696997");
				}else if(chooseType==2) {
					System.out.print("����������Ҫ���޵�������");
					day=input.nextInt();
					System.out.println("��������ĳ��ƺ�Ϊ����8696998");
				}else{
					System.out.print("�������󣬳��������ллʹ�ã�");
					System.exit(1);
				}
			}else{
				System.out.print("�������󣬳��������ллʹ�ã�");
				System.exit(1);
		}
		}else{
			System.out.print("�������󣬳��������ллʹ�ã�");
			System.exit(1);
		}
			//�������
		if (chooseKind==1 && chooseBrand==1&& chooseType==1) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[0].money(day));					
		}else if(chooseKind==1 && chooseBrand==1&& chooseType==2) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[1].money(day));		
		}else if(chooseKind==1 && chooseBrand==2&& chooseType==1) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[2].money(day));	
		}else if(chooseKind==1 && chooseBrand==2&& chooseType==2) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[3].money(day));	
		}else if(chooseKind==2 && chooseBrand==1&& chooseType==1) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[4].money(day));	
		}else if(chooseKind==2 && chooseBrand==1&& chooseType==2) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[5].money(day));	
		}else if(chooseKind==2 && chooseBrand==2&& chooseType==1) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[6].money(day));	
		}else if(chooseKind==2 && chooseBrand==2&& chooseType==2) {
			System.out.println("����Ҫ֧�������Ϊ��"+arr[7].money(day));	
		}			
	}	
}	
