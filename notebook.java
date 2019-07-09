package day01_practic;
/*
 * 8、提取笔记本的属性，并使用三种方法，显示笔记本的信息
 */
public class notebook {
   int page;        //页数
   String brand;    //品牌
   String color;    //颜色
   
   //三种显示笔记本信息的方式
   public void show1(int page,String brand, String color){
	   notebook t=new notebook();
	   System.out.println(page+"\t"+brand+"\t"+color);
   }
public void show2(notebook t){
	
	   System.out.println(t.page+"\t"+t.brand+"\t"+t.color);
   }
public void show3(){
	   
	   System.out.println(page+"\t"+brand+"\t"+color);
}
}
