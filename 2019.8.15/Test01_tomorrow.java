package time;
/*
 * ��ȡ��ǰ��ʱ�䣬Ȼ��������մ˿̵�ʱ��
 * (Ҫ�������ʽ xxxx��xx��xx��  ����/����    xxʱ��xx�֣�xx��   ���ڼ� )��
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01_tomorrow {

	public static void main(String[] args) {
		
		//����Calendar����
		Calendar c=Calendar.getInstance();
		//����һ��
		c.add(Calendar.DAY_OF_YEAR, 1);
		//����ΪDate����
		Date date=c.getTime();
		//���ø�ʽ
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
		//���
		System.out.println("���յĴ�ʱ�˿���:  "+sdf.format(date));
	}

}
