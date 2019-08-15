package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test02 {
/*
 * 2���Լ�����¼��һ��ʱ�䣬��ʽΪ"yyyy-MM-dd HH:mm:ss"��
 * Ȼ��ֱ�������ʱ��ķ������꣬�£��ա�
 * ���¼��������ַ�����ʽ���ԣ�������¼��ʱ�䡣
 */
	public static void main(String[] args) {
			System.out.println("������ʱ��: ");
			Date date=null;
		while(true) {
			//¼���ַ���
			Scanner in = new Scanner(System.in);		
			String input=in.nextLine();
			//����SimpleDateFormat��ʽ
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			try {
				//���ַ���ת��ΪDate��ʽ
				 date=sdf.parse(input);
			} catch (ParseException e) {
				System.out.println("�����ʽ����,����������: ");
				continue;	
			}in.close();
			 break;
		}
			//����Calendar����
			Calendar c=Calendar.getInstance();
			c.setTime(date);
			//�ֱ������ �� ��
			System.out.println("��:"+c.getWeekYear());
			System.out.println("��:"+(c.get(Calendar.MONTH)+1));
			System.out.println("��:"+c.get(Calendar.DAY_OF_MONTH));
			
	}

}
