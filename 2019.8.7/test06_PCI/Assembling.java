package chapter8_PCI;

public class Assembling {
	public void setPCI() {
		//装配各种卡
		GPU g=new GPU();
		Audio a=new Audio();		
		Network n=new Network();
		//开始工作
		g.statr();
		a.statr();
		n.statr();
		//结束工作
		g.stop();
		a.stop();
		n.stop();
	}
	
}
