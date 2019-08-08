package chapter9_mobilePhone;

public class AptitudeHandset extends Handset implements TheakePicture, Network,PlayWiring {

	public AptitudeHandset(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void networkConn() {
		System.out.print("����  ");

	}

	@Override
	public void takePicture() {
		System.out.print("����  ");

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
		this.networkConn();
		this.play("������Ƶ  ");
		this.takePicture();
		this.sendInfo();
		this.call();

	}

	@Override
	public void play(String inconnect) {
		System.out.print(inconnect);
		
	}

}
