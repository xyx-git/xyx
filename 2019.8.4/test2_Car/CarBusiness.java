package chapter9_carCental;
/*
 * 汽车租赁系统，实现租车功能，并计算租金
 */
import java.util.Scanner;

public class CarBusiness  {
	static int day;    //租车时间	
	
	public static void main(String[] args) {		
	
		//创建车辆
		Automobile []arr=new Automobile [8];
		arr[0]=new Car("别克","京NT37465",300,"林荫大道");
		arr[1]=new Car("别克","京NT96968",600,"GL8");
		arr[2]=new Car("宝马","京NY28588",800,"X6");
		arr[3]=new Car("宝马","京CNY3284",600,"550i");
		arr[4]=new Bus("金杯","京6566754",800,16);
		arr[5]=new Bus("金杯","京9696996",1500,34);
		arr[6]=new Bus("金龙","京8696997",800,16);
		arr[7]=new Bus("金龙","京8696998",1500,34);					
				
		//通过系统录入选择对应的车辆
		Scanner input =new Scanner(System.in);					
		int chooseKind=0;//选择种类
		int chooseBrand = 0;//选择品牌
		int chooseType=0;//选择类型
		int day=0;//租车时间
		
		System.out.println("***********欢迎光临腾飞汽车租赁有限公司***********\n1、轿车\t2、客车");	
		System.out.print("请选择您需要租赁的汽车种类：\t");
		 chooseKind=input.nextInt();
		if (chooseKind==1) {
			System.out.print("请选择您需要的租赁的汽车品牌：1、别克 \t2、宝马\t");
			chooseBrand=input.nextInt();
			if (chooseBrand==1) {
				System.out.print("请您选择您需要租赁的汽车类型：1、别克林荫大道 \t 2、别克GL8\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京NT37465");
				}else if(chooseType==2) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京NT96968");
				}else {
					System.out.print("输入有误，程序结束，谢谢使用！");
					System.exit(1);
				}
			}else if(chooseBrand==2){
				System.out.print("请您选择您需要租赁的汽车类型：1、宝马X6 \t 2、宝马550i\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京NY28588");
				}else if(chooseType==2) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京CNY3284");
				}else {
					System.out.print("输入有误，程序结束，谢谢使用！");
					System.exit(1);
				}
			}else {
				System.out.print("输入有误，程序结束，谢谢使用！");
				System.exit(1);
			}
		}else if(chooseKind==2) {
			System.out.print("请选择您需要的租赁的汽车品牌：1、金杯\t 2、金龙\t");
			chooseBrand=input.nextInt();
			if (chooseBrand==1) {
				System.out.print("请您选择您需要租赁的汽车类型：1、16座 \t 2、34座\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京6566754");
				}else if(chooseType==2) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京9696996");
				}else{
						System.out.print("输入有误，程序结束，谢谢使用！");
						System.exit(1);
				}
			}else if(chooseBrand==2){
				System.out.print("请您选择您需要租赁的汽车类型：1、16座 \t 2、34座\t");
				chooseType=input.nextInt();
				if (chooseType==1) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京8696997");
				}else if(chooseType==2) {
					System.out.print("请输入您需要租赁的天数：");
					day=input.nextInt();
					System.out.println("分配给您的车牌号为：京8696998");
				}else{
					System.out.print("输入有误，程序结束，谢谢使用！");
					System.exit(1);
				}
			}else{
				System.out.print("输入有误，程序结束，谢谢使用！");
				System.exit(1);
		}
		}else{
			System.out.print("输入有误，程序结束，谢谢使用！");
			System.exit(1);
		}
			//计算租金
		if (chooseKind==1 && chooseBrand==1&& chooseType==1) {
			System.out.println("您需要支付的租金为："+arr[0].money(day));					
		}else if(chooseKind==1 && chooseBrand==1&& chooseType==2) {
			System.out.println("您需要支付的租金为："+arr[1].money(day));		
		}else if(chooseKind==1 && chooseBrand==2&& chooseType==1) {
			System.out.println("您需要支付的租金为："+arr[2].money(day));	
		}else if(chooseKind==1 && chooseBrand==2&& chooseType==2) {
			System.out.println("您需要支付的租金为："+arr[3].money(day));	
		}else if(chooseKind==2 && chooseBrand==1&& chooseType==1) {
			System.out.println("您需要支付的租金为："+arr[4].money(day));	
		}else if(chooseKind==2 && chooseBrand==1&& chooseType==2) {
			System.out.println("您需要支付的租金为："+arr[5].money(day));	
		}else if(chooseKind==2 && chooseBrand==2&& chooseType==1) {
			System.out.println("您需要支付的租金为："+arr[6].money(day));	
		}else if(chooseKind==2 && chooseBrand==2&& chooseType==2) {
			System.out.println("您需要支付的租金为："+arr[7].money(day));	
		}			
	}	
}	
