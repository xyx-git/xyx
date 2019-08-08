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
		System.out.print("发信息  ");
	}

	@Override
	void call() {
		System.out.print("打电话  ");

	}

	@Override
	void info() {
		System.out.print("使用"+this.getBrand()+this.getType()+"手机:");
		this.play("播放视频  ");
		this.sendInfo();
		this.call();

	}

}
