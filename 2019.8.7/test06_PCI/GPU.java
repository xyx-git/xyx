package chapter8_PCI;

public class GPU implements PCI{
	public void statr() {
		System.out.println("显卡开始工作");
	}

	public void stop() {
		System.out.println("显卡停止工作");

	}
}
