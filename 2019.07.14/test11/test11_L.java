package day02_practic;

public class test11_L {
	

		int x;
		int y;
		
		test11_cell [] L;
		
		//������L��ͼ��
		public void test11_L(int x,int y) {
			L= new test11_cell [] {
					new test11_cell(x,y),
					new test11_cell(x+1,y),
					new test11_cell(x,y+1),
					new test11_cell(x,y+2),
					new test11_cell(x,y+3),				
			};
		}
		
		//�ƶ�ͼ��
		public void left() {
			for(test11_cell l:L){
				 l.x--;
			 };
	    }
	    public void right() {
	    	for(test11_cell l:L){
				 l.x++;
			 };
	    }
	    public void drop() {
	    	for(test11_cell l:L){
				 l.y++;
			 };
	    }
	    public void drop(int n) {
	    	for(test11_cell l:L){
				 l.y+=n;
			 };
	    }
	    
	    
	    
	    //��ʾ"L"��ͼ�������
		 public void showImg() {
			 for(test11_cell l:L) {
				 l.showInfo();
			 }
		 }
}		
	


