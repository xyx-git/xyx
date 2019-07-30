package day07_Rect;
/*
 * ��2��ͨ���̳�Rect���дһ������ȷ��λ�õľ�����PlainRect����ȷ��λ����
 * ���ε����Ͻ���������ʶ��������
 * ����������ԣ��������Ͻ�����startX��startY��
 * �������췽����
 * ��4�������Ĺ��췽�������ڶ�startX��startY��width��height����
 * ��ʼ����
 * ���������Ĺ��췽���������γ�ʼ��Ϊ���Ͻ����ꡢ���Ϳ�Ϊ0
 * �ľ��Σ�
 * ���һ��������
 * �ж�ĳ�����Ƿ��ھ����ڲ��ķ���isInside(double x,double y)�����ھ�
 * ���ڣ�����true, ���򣬷���false��
 *  ��ʾ�����ھ�������ָ����������
 *   x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)
 */
public class PlainRect extends Rect {
	double startX;
	double startY;
	
	
	public PlainRect(double x,double y, double w,double h) {
		super(w,h);
		this.startX=x;
		this.startY=y;		
		
	}
	
	
	public PlainRect() {
		
		this.startX=0;
		this.startY=0;
		super.height=0;
		super.width=0;
	}
	
	public boolean isInside(double x,double y) {
		if(x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
		return true;
		}else {
		return false;
		}
	}
}
