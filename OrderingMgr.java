package day08;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �Ի����˶���ϵͳ
 */
public class OrderingMgr3 {

	public static void main(String[] args) {
		//�����Ʒ���飬������
		String [] dishNames = {"����	","����","��Ȫˮ"};//����
		double [] prices = {10.0,20.0,15.0};              //�۸�
		int [] praiseNums =new int [3];                   //������
		
		//���嶩�����飬�û����4��
		String [] names= new String[4];     //����������
		String [] dishmegs= new String[4];  //��ѡ��Ʒ���������ƺͷ���
		int [] times= new int[4];           //�ʹ�ʱ��
		String [] addresses= new String[4]; //���͵�ַ
		int [] states= new int[4];          
		double [] sumprices = new double [4];
		
		int num=-1;//�û�¼��0�������˵��������˳�ϵͳ
		boolean isExit=false; //��ʶ�û��Ƿ��˳�ϵͳ
		//ѭ����ʾϵͳ�˵����û�����¼��������֣�ִ����Ӧ�Ĺ���
		do {
		Scanner input =new Scanner(System.in);
		
		System.out.println("��ӭʹ�óԻ����˶���ϵͳ");
		System.out.println("***********************");
		System.out.println("1����Ҫ����");
		System.out.println("2���鿴�ʹ�");
		System.out.println("3��ǩ�ն���");
		System.out.println("4��ɾ������");
		System.out.println("5����Ҫ����");
		System.out.println("6���˳�ϵͳ");
		System.out.println("**********************");
		System.out.print("��ѡ��:");
		int choose=input.nextInt();//¼���û�ѡ��ı��
		
		//�����û�����Ĺ��ܱ�ţ�ִ����Ӧ�Ĺ���
		switch (choose) {
		case 1://ִ����Ҫ����
			
			System.out.println("***��Ҫ����***");
			boolean isAdd =false;//��ʶ�Ƿ���Զ��ͣ������������Ƿ�����
			//��ζ����У���У�鶩���Ƿ�������
			for (int j=0;j<names.length ;j++) {
				if (names[j]==null) {   //�ҵ���һ����λ����Ӷ�����Ϣ
				isAdd=true;//��ʶ�����¶���	
				
			//��ʾ����
			System.out.println("���"+"\t"+"����"+"\t"+"����/Ԫ"+"\t"+"������");
			for(int i=0;i<dishNames.length;i++) {
//				String price =prices[i]+"Ԫ";
				String praiseNum=praiseNums[i]>0? +praiseNums[i]+"��":"0";
				System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"\t"+praiseNum);
			}
			//�û�ѡ���Ʒ
			System.out.println("�����붩����������");
			String name=input.next();
			System.out.println("����������Ҫ�Ĳ�Ʒ��ţ�");
			int chooseDish =input.nextInt();
			System.out.println("��ѡ������Ҫ�ķ�����");
			int number =input.nextInt();
			String disMeg=dishNames [chooseDish-1]+""+number+"��";
			
			//���ͽ��=����*����
			double sumPrices=prices[chooseDish-1]*number;
			       // �ͷѴ�����50Ԫ�����ͷ�5Ԫ
			double diliCharge=sumPrices>50? 0:5;
			//�Ͳ�ʱ��
			System.out.println("�������Ͳ�ʱ�䣨10��-20��֮�䣩��");
			int time=input.nextInt();
			       //���ʱ�������������¼��
			while (time<10 || time>20) {
				System.out.println("������������������10-20��������");
				time=input.nextInt();
			}
			//�Ͳ͵�ַ
			System.out.println("�������Ͳ͵�ַ��");
			String adress =input.next();
			//����״̬   0--Ԥ����1--�����
//			states [chooseDish-1]=0;         int����Ĭ��ֵΪ0�����Բ�д
			System.out.println("���ͳɹ���");
			System.out.println("���Ķ����ǣ�"+disMeg);
			System.out.println("�����Ͳ�ʱ���ǣ�"+time+"��");
			System.out.println("�ͷѣ�"+sumPrices+"Ԫ���Ͳͷѣ�"+diliCharge+"Ԫ���ܼƣ�"+(sumPrices+diliCharge)+"Ԫ");
				
			//��������Ϣ��ӵ�����������
			names [j]=name;
			dishmegs [j]=disMeg;
			times [j]=time;
			addresses[j]=adress;
			sumprices [j]=(sumPrices+diliCharge);
				break;	
				}
				if (isAdd==false) {    //isAddΪfalse��ʾ�ʹ������������µ�
					System.out.println("�Բ��𣬲ʹ�������");
				}
			}
			System.out.println(Arrays.toString(names));
			System.out.println(Arrays.toString(dishmegs));
			System.out.println(Arrays.toString(times));
			System.out.println(Arrays.toString(addresses));
			System.out.println(Arrays.toString(sumprices));
			break;
		case 2://ִ�в鿴����
			System.out.println("***�鿴�ʹ�***");
			//�鿴�������飬��ʾ�¹��Ķ���
			//��ʾ��ʽ��    ���  ������  ��Ʒ��Ϣ  �Ͳ�ʱ�� �Ͳ͵�ַ   �ܽ��   ����״̬
			System.out.println("���"+"\t"+"������"+"\t"+"��Ʒ��Ϣ"+"\t"+"�ʹ�ʱ��"+"\t"+"�ܽ��"+"\t"+"����״̬");	
			int serial;
			for(serial=1;serial<=names.length;serial++) {
			System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+times[serial -1]+"\t"+sumprices [serial -1]+"\t"+states [serial -1]);
			}
			break;
			
		case 3:
			System.out.println("***ǩ�ն���***");
			 System.out.println("��ѡ������");
		    for(serial=1;serial<=names.length;serial++) {
				System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+states [serial -1]);
		    }
		    System.out.println("��ѡ������Ҫǩ�յĶ�����ţ�");
			int dishnum=input.nextInt();
			boolean status=false;
			 do {
			  
				if(dishnum<=4 && dishnum>=1) {
				  if(names[dishnum -1]==null) {
					System.out.println("����������!���������룺");
					dishnum=input.nextInt();
					status=true;
				    }else if (states [dishnum -1]==1) {
					System.out.println("������ǩ�գ������ظ�������");
					status=false;
				   }else if (names[dishnum -1]!=null){
					states [dishnum -1]=1;
					System.out.println("ǩ�ճɹ�");
					status=false;
				   }
				}else {
					System.out.println("����������!���������룺");
					dishnum=input.nextInt();
					status=true;
				}
				
			 }while(status=false);
			
			break;
		case 4:
			System.out.println("***ɾ������***"); 
			 System.out.println("�Ѵ��ڶ�����");
			    for(serial=1;serial<=names.length;serial++) {
					System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+states [serial -1]);
			    }
			    System.out.println("��ѡ������Ҫɾ���Ķ�����ţ�");
			   
			    
			    	int deletedish =input.nextInt();
			    	names [deletedish-1]=null;
					dishmegs [deletedish-1]=null;
					times [deletedish-1]=0;
					addresses[deletedish-1]=null;
					sumprices [deletedish-1]=0;
					states [deletedish-1]=0;
			    
			    System.out.println("��ɾ����");
			    
			    
			break;
		case 5:
			System.out.println("***��Ҫ����***");
			System.out.println("��ѡ����Ҫ���޵Ķ���");
			int pride =input.nextInt();
			praiseNums [pride-1]++;
			System.out.println("���޳ɹ���лл��");
			
			break;
//		case 6://�˳�ϵͳ
//			isExit=true;
//			break;
		default://���ܱ�Ŵ���Ĭ���˳�ϵͳ
			System.out.println("***��лʹ�ã�***");
			isExit=true;
			input.close();
			break;
		}
		
		
		
		if (!isExit) {//���˳�ϵͳ�����Է������˵�
			System.out.println("����0�������˵���");
			num=input.nextInt();
		}else {//����ѭ��
			input.close();
			break;
		}
		
		
		}while(num==0);
	
		
		
	}

}
