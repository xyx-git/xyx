package day01_practic;
/*
 * 9、有一个对象，能存放5个一个水杯。
 */
public class waterCups {
   String name;
   int capacity;
   String color;
   public static void main(String[] args) {
	   waterCups [] cups=new waterCups[5];
	   
	   waterCups c1=new waterCups();
	   c1.name="水杯1";
	   c1.capacity=300;
	   c1.color="红色";
	   
	   waterCups c2=new waterCups();
	   c2.name="水杯2";
	   c2.capacity=500;
	   c2.color="黄色";
	   
	   waterCups c3=new waterCups();
	   c3.name="水杯3";
	   c3.capacity=600;
	   c3.color="蓝色";
	   
	   waterCups c4=new waterCups();
	   c4.name="水杯4";
	   c4.capacity=800;
	   c4.color="黑色";
	   
	   waterCups c5=new waterCups();
	   c5.name="水杯5";
	   c5.capacity=1000;
	   c5.color="白色";
}
   
}
