package chapter8_PCI;

public class Audio implements PCI {

	public void statr() {
		System.out.println("声卡开始工作");
	}

	public void stop() {
		System.out.println("声卡停止工作");
	}

}
