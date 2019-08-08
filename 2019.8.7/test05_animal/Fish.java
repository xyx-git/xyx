package chapter8_Animail;

public class Fish extends Animail {
	private int weight;
	
	public Fish(int age, int weight) {
		super(age);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	void info() {
		System.out.println("我是条"+getWeight()+"斤重的鱼");
		System.out.println("今年"+getAge()+"岁了");
	}
}
