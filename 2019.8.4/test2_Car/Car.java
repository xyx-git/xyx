package chapter9_carCental;
/*
 * ����С�γ������࣬�̳и���Automobile������ʵ��LeaseManagement�ӿ�
 *    ͬʱ�߱�Automobile��LeaseManagement�����Ժͷ���
 * 
 */
public   class Car extends Automobile{
	

	String type;

	public Car(String brand, String carNumber, int rent, String type) {
		super(brand, carNumber, rent);
		this.type = type;
	}
	public int discount(int day)	{//��д���󷽷�int discount(int day)    �����ۿ�
		 int discount = 10;
		 boolean b=false;
		do {		
		if (day>150) {
			discount=7;
		}else if(day>30) {
			discount=8;
		}else if(day>7) {
			discount=9;
		}else {
			discount=10;
		}return discount;
		}while(b==false);
	}
	
	public int money(int day) {//��д���󷽷�int money(int day)     ���������
		int totalMoney=rent*day*discount(day)/10;		
		return totalMoney;		
	}
	
	 
	
}