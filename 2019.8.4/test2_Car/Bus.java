package chapter9_carCental;

public class Bus extends Automobile implements LeaseManagement{
	int seat;
	public Bus(String brand, String carNumber, int rent,int seat) {
		super(brand, carNumber, rent);
		this.seat=seat;
	}
	public int discount(int day)	{//��д���󷽷�int discount(int day)    �����ۿ�
		 int discount = 10;
		 boolean b=false;
		do {		
		if (day>=150) {
			discount=6;
		}else if(day>=30) {
			discount=7;
		}else if(day>=7) {
			discount=8;
		}else if(day>=3) {
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
