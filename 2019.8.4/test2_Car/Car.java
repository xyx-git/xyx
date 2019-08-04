package chapter9_carCental;
/*
 * 定义小轿车抽象类，继承父类Automobile，并且实现LeaseManagement接口
 *    同时具备Automobile和LeaseManagement的属性和方法
 * 
 */
public   class Car extends Automobile{
	

	String type;

	public Car(String brand, String carNumber, int rent, String type) {
		super(brand, carNumber, rent);
		this.type = type;
	}
	public int discount(int day)	{//重写抽象方法int discount(int day)    计算折扣
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
	
	public int money(int day) {//重写抽象方法int money(int day)     计算总租金
		int totalMoney=rent*day*discount(day)/10;		
		return totalMoney;		
	}
	
	 
	
}