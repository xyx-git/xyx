package chapter9_carCental;
/*
 * �������������࣬ʵ�����޹���ϵͳ
 */
public abstract class Automobile  implements LeaseManagement{
	//��������
	String brand;//Ʒ��	
	String carNumber;//���ƺ�
	int rent;//�����
	
	public Automobile(String brand,  String carNumber, int rent) {
		this.brand = brand;
		this.carNumber = carNumber;
		this.rent = rent;
	}
	
	
	
	

}
