package day01_practic;
/*
 * 8����ȡ�ʼǱ������ԣ���ʹ�����ַ�������ʾ�ʼǱ�����Ϣ
 */
public class notebook {
   int page;        //ҳ��
   String brand;    //Ʒ��
   String color;    //��ɫ
   
   //������ʾ�ʼǱ���Ϣ�ķ�ʽ
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
