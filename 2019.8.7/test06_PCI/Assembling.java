package chapter8_PCI;

public class Assembling {
	public void setPCI() {
		//װ����ֿ�
		GPU g=new GPU();
		Audio a=new Audio();		
		Network n=new Network();
		//��ʼ����
		g.statr();
		a.statr();
		n.statr();
		//��������
		g.stop();
		a.stop();
		n.stop();
	}
	
}
