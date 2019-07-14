package day02_practic;
/*
 * 在墙纸上能打印图像，如：
- - - - - - - - - - - - - - - - - - 
- - - -# # #- - - - - - - - - -
- - - - -# - - - - - - - - - - -
- - - - -# - - - - - - - - - - - - -
 */
public class test11_wall {
	//通过坐标，定位墙纸的位置
		int x;
		int y;
		
		//墙纸的长宽
		int length;
		int hight;
		
		public  test11_wall(int x1,int y1,int length1,int hight1) {
			x=x1;
			y=y1;
			length=length1;
			hight=hight1;
		}
		
		public void printWall(test11_T img) {
			//获取格子数组
			test11_cell[] t = img.T;
			
			//定位墙纸纵坐标的位置
			for(int p=0;p<y;p++) {
				System.out.println();
			}
			
			//打印墙纸的同时定位横坐标
			for(int i=0;i<y+hight;i++) {//行

				for(int j=0;j<x+length;j++) {//列
					//定位墙纸横坐标的位置
					if(j<x) {
						System.out.print(" ");
					}else if(
							(t[0].x==j && t[0].y==i) || 
							(t[1].x==j && t[1].y==i) || 
							(t[2].x==j && t[2].y==i) ||  
							(t[3].x==j && t[3].y==i) ||
							(t[4].x==j && t[4].y==i)
							) {//打印格子
						System.out.print("#");
					}else {//打印"-"
						System.out.print("-");
					}
				}
					System.out.println();
		
			}
			
		}
		
		public void printWall(test11_L im) {
			//获取格子数组
			test11_cell[] l = im.L;
			
			//定位墙纸纵坐标的位置
			for(int p=0;p<y;p++) {
				System.out.println();
			}
			
			//打印墙纸的同时定位横坐标
			for(int i=0;i<y+hight;i++) {//行

				for(int j=0;j<x+length;j++) {//列
					//定位墙纸横坐标的位置
					if(j<x) {
						System.out.print(" ");
					}else if(
							(l[0].x==j && l[0].y==i) || 
							(l[1].x==j && l[1].y==i) || 
							(l[2].x==j && l[2].y==i) ||  
							(l[3].x==j && l[3].y==i) ||
							(l[4].x==j && l[4].y==i)
							) {//打印格子
						System.out.print("#");
					}else {//打印"-"
						System.out.print("-");
					}
				}
					System.out.println();
		
			}
			
		}
}
