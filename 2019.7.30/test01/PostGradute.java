package day07_test;

public class PostGradute extends Test01_Student {
    
    public void print() {    
    	System.out.println("��������ʸ����е�sex��"+super.sex);
    }
    public static void main(String[] args) {    	
    	PostGradute p=new PostGradute();
		p.print();	
		}
}
