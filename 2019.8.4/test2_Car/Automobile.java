package chapter9_carCental;
/*
 * 建立抽象汽车类，实现租赁管理系统
 */
public abstract class Automobile  implements LeaseManagement{
	//定义属性
	String brand;//品牌	
	String carNumber;//车牌号
	int rent;//日租金
	
	public Automobile(String brand,  String carNumber, int rent) {
		this.brand = brand;
		this.carNumber = carNumber;
		this.rent = rent;
	}
	
	
	
	

}
