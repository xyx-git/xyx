package day02_practic;

public class test11_L {
	

		int x;
		int y;
		
		test11_cell [] L;
		
		//创建“L”图像
		public void test11_L(int x,int y) {
			L= new test11_cell [] {
					new test11_cell(x,y),
					new test11_cell(x+1,y),
					new test11_cell(x,y+1),
					new test11_cell(x,y+2),
					new test11_cell(x,y+3),				
			};
		}
		
		//移动图像
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
	    
	    
	    
	    //显示"L"子图像的坐标
		 public void showImg() {
			 for(test11_cell l:L) {
				 l.showInfo();
			 }
		 }
}		
	


