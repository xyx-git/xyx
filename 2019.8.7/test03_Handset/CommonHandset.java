package chapter9_mobilePhone;

public class CommonHandset extends Handset implements PlayWiring {

	public CommonHandset(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String inconnect) {
		System.out.print(inconnect);
	}

	@Override
	void sendInfo() {
		System.out.print("����Ϣ  ");
	}

	@Override
	void call() {
		System.out.print("��绰  ");

	}

	@Override
	void info() {
		System.out.print("ʹ��"+this.getBrand()+this.getType()+"�ֻ�:");
		this.play("������Ƶ  ");
		this.sendInfo();
		this.call();

	}

}
