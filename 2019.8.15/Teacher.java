package time;
/*
 * 编写一个Teacher类，有属性name，sex。
 * 重写toString方法。要求打印Teacher类的对象时，能够输出
 * ”类名:  name，sex的值”。
 * 重写equals方法，要求比较Teacher类的两个对象时，对象相同或者对象中属性值一样，返回true。
 * （在代码的类前写好注释：  toString和equals方法来自哪个父类。并且父类中它们的功能是什么，请说明）
 */
public class Teacher {
	private String name;
	private String sex;
	
	//创建构造方法初始化 name  sex
	public Teacher(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
	//重新toString 
	public String tostring() {	
		return "类名:"+this.getClass().getSimpleName()+"  name:"+this.name+"  sex:"+this.sex;
	}
	//重写equals
	 public boolean equals(Object obj) {
		 //判断是否存在继承关系
		 if(obj instanceof Teacher) {
			 //比较
			 if((((Teacher) obj).getSex()==this.getSex())&&(((Teacher) obj).getName()==this.getName())) {
				 return true;
			 }else {
				 return false;
			 }
		 }else {
			 return false;
		 }
		
	    } 
	//测试
	public static void main(String[] args) {
		Teacher t=new Teacher("张三", "男");
		System.out.println(t.tostring());
		Object obj=new Teacher("dd", "nan");
		System.out.println(t.equals(obj));
	}
	
}
