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
		System.out.println("������"+getWeight()+"���ص���");
		System.out.println("����"+getAge()+"����");
	}
}
