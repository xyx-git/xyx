package day05_practice;

public class MobilePhone {
	public String brand;             //public修饰成员变量
	
	public MobilePhone() {
		this.brand="诺基亚";          //使用this访问成员变量
	}
	public MobilePhone(String bra) {//重载构造方法
		this.brand=bra;             //使用this访问成员变量
	}
	public String buy() {
		return "没发工资，买一个"+brand+"牌子的手机吧！";
	}
	public String buy(String reason) {
		return reason+",快买一个"+brand+"牌子的手机吧！";
	}
}


	

