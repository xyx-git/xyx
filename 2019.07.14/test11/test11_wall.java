package day02_practic;
/*
 * ��ǽֽ���ܴ�ӡͼ���磺
- - - - - - - - - - - - - - - - - - 
- - - -# # #- - - - - - - - - -
- - - - -# - - - - - - - - - - -
- - - - -# - - - - - - - - - - - - -
 */
public class test11_wall {
	//ͨ�����꣬��λǽֽ��λ��
		int x;
		int y;
		
		//ǽֽ�ĳ���
		int length;
		int hight;
		
		public  test11_wall(int x1,int y1,int length1,int hight1) {
			x=x1;
			y=y1;
			length=length1;
			hight=hight1;
		}
		
		public void printWall(test11_T img) {
			//��ȡ��������
			test11_cell[] t = img.T;
			
			//��λǽֽ�������λ��
			for(int p=0;p<y;p++) {
				System.out.println();
			}
			
			//��ӡǽֽ��ͬʱ��λ������
			for(int i=0;i<y+hight;i++) {//��

				for(int j=0;j<x+length;j++) {//��
					//��λǽֽ�������λ��
					if(j<x) {
						System.out.print(" ");
					}else if(
							(t[0].x==j && t[0].y==i) || 
							(t[1].x==j && t[1].y==i) || 
							(t[2].x==j && t[2].y==i) ||  
							(t[3].x==j && t[3].y==i) ||
							(t[4].x==j && t[4].y==i)
							) {//��ӡ����
						System.out.print("#");
					}else {//��ӡ"-"
						System.out.print("-");
					}
				}
					System.out.println();
		
			}
			
		}
		
		public void printWall(test11_L im) {
			//��ȡ��������
			test11_cell[] l = im.L;
			
			//��λǽֽ�������λ��
			for(int p=0;p<y;p++) {
				System.out.println();
			}
			
			//��ӡǽֽ��ͬʱ��λ������
			for(int i=0;i<y+hight;i++) {//��

				for(int j=0;j<x+length;j++) {//��
					//��λǽֽ�������λ��
					if(j<x) {
						System.out.print(" ");
					}else if(
							(l[0].x==j && l[0].y==i) || 
							(l[1].x==j && l[1].y==i) || 
							(l[2].x==j && l[2].y==i) ||  
							(l[3].x==j && l[3].y==i) ||
							(l[4].x==j && l[4].y==i)
							) {//��ӡ����
						System.out.print("#");
					}else {//��ӡ"-"
						System.out.print("-");
					}
				}
					System.out.println();
		
			}
			
		}
}
