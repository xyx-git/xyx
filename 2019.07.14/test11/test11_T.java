package day02_practic;




public class test11_T {

	int x;
	int y;
	
	test11_cell [] T;
	
	//创建“T”图像
	public void test11_T(int x,int y) {
		T= new test11_cell [] {
				new test11_cell(x,y),
				new test11_cell(x+1,y),
				new test11_cell(x+1,y+1),
				new test11_cell(x+1,y+2),
				new test11_cell(x+2,y),				
		};
	}
	
	//移动图像
	public void left() {
		for(test11_cell t:T){
			 t.x--;
		 };
    }
    public void right() {
    	for(test11_cell t:T){
			 t.x++;
		 };
    }
    public void drop() {
    	for(test11_cell t:T){
			 t.y++;
		 };
    }
    public void drop(int n) {
    	for(test11_cell t:T){
			 t.y+=n;
		 };
    }
    
    
    
    //显示"T"子图像的坐标
	 public void showImg() {
		 for(test11_cell t:T) {
			 t.showInfo();
		 }
	 }
	
}
