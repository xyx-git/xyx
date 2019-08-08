package chapter8_PCI;

public class Network implements PCI {
	public void statr() {
		System.out.println("网卡开始工作");
	}

	public void stop() {
		System.out.println("网卡停止工作");
	}
}
