package chapter8_Animail;

public class Bird extends Animail {
	private String color;
	
	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	

	void info() {
		System.out.println("我是一只"+getColor()+"的鸟");
		System.out.println("今年"+getAge()+"岁了");
	}

}
