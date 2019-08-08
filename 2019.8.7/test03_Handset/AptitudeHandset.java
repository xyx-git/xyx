package chapter9_mobilePhone;

public class AptitudeHandset extends Handset implements TheakePicture, Network,PlayWiring {

	public AptitudeHandset(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void networkConn() {
		System.out.print("上网  ");

	}

	@Override
	public void takePicture() {
		System.out.print("拍照  ");

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
		this.networkConn();
		this.play("播放视频  ");
		this.takePicture();
		this.sendInfo();
		this.call();

	}

	@Override
	public void play(String inconnect) {
		System.out.print(inconnect);
		
	}

}
