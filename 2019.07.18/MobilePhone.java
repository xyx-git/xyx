package day05_practice;

public class MobilePhone {
	public String brand;             //public���γ�Ա����
	
	public MobilePhone() {
		this.brand="ŵ����";          //ʹ��this���ʳ�Ա����
	}
	public MobilePhone(String bra) {//���ع��췽��
		this.brand=bra;             //ʹ��this���ʳ�Ա����
	}
	public String buy() {
		return "û�����ʣ���һ��"+brand+"���ӵ��ֻ��ɣ�";
	}
	public String buy(String reason) {
		return reason+",����һ��"+brand+"���ӵ��ֻ��ɣ�";
	}
}


	

