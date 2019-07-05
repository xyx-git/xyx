package day08;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 吃货联盟订餐系统
 */
public class OrderingMgr3 {

	public static void main(String[] args) {
		//定义菜品数组，及数据
		String [] dishNames = {"瓜子	","花生","矿泉水"};//菜名
		double [] prices = {10.0,20.0,15.0};              //价格
		int [] praiseNums =new int [3];                   //点赞数
		
		//定义订单数组，用户最多4条
		String [] names= new String[4];     //订餐人名称
		String [] dishmegs= new String[4];  //所选菜品，包括名称和份数
		int [] times= new int[4];           //送达时间
		String [] addresses= new String[4]; //配送地址
		int [] states= new int[4];          
		double [] sumprices = new double [4];
		
		int num=-1;//用户录入0返回主菜单，否则退出系统
		boolean isExit=false; //标识用户是否退出系统
		//循环显示系统菜单，用户根据录入相关数字，执行相应的功能
		do {
		Scanner input =new Scanner(System.in);
		
		System.out.println("欢迎使用吃货联盟订餐系统");
		System.out.println("***********************");
		System.out.println("1、我要订餐");
		System.out.println("2、查看餐袋");
		System.out.println("3、签收订单");
		System.out.println("4、删除订单");
		System.out.println("5、我要点赞");
		System.out.println("6、退出系统");
		System.out.println("**********************");
		System.out.print("请选择:");
		int choose=input.nextInt();//录入用户选择的编号
		
		//根据用户输入的功能编号，执行相应的功能
		switch (choose) {
		case 1://执行我要订餐
			
			System.out.println("***我要订餐***");
			boolean isAdd =false;//标识是否可以订餐，即订餐数组是否已满
			//多次订餐中，需校验订餐是否已满。
			for (int j=0;j<names.length ;j++) {
				if (names[j]==null) {   //找到第一个空位，添加订单信息
				isAdd=true;//标识可以下订单	
				
			//显示菜名
			System.out.println("序号"+"\t"+"菜名"+"\t"+"单价/元"+"\t"+"点赞数");
			for(int i=0;i<dishNames.length;i++) {
//				String price =prices[i]+"元";
				String praiseNum=praiseNums[i]>0? +praiseNums[i]+"赞":"0";
				System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"\t"+praiseNum);
			}
			//用户选择菜品
			System.out.println("请输入订餐人姓名：");
			String name=input.next();
			System.out.println("请输入你需要的菜品编号：");
			int chooseDish =input.nextInt();
			System.out.println("请选择您需要的份数：");
			int number =input.nextInt();
			String disMeg=dishNames [chooseDish-1]+""+number+"份";
			
			//订餐金额=单价*份数
			double sumPrices=prices[chooseDish-1]*number;
			       // 餐费处理，满50元免配送费5元
			double diliCharge=sumPrices>50? 0:5;
			//送餐时间
			System.out.println("请输入送餐时间（10点-20点之间）：");
			int time=input.nextInt();
			       //针对时间输入错误，重新录入
			while (time<10 || time>20) {
				System.out.println("您的输入有误，请输入10-20的整数！");
				time=input.nextInt();
			}
			//送餐地址
			System.out.println("请输入送餐地址：");
			String adress =input.next();
			//订单状态   0--预定；1--已完成
//			states [chooseDish-1]=0;         int类型默认值为0，可以不写
			System.out.println("订餐成功！");
			System.out.println("您的订单是："+disMeg);
			System.out.println("您的送餐时间是："+time+"点");
			System.out.println("餐费："+sumPrices+"元，送餐费："+diliCharge+"元。总计："+(sumPrices+diliCharge)+"元");
				
			//将订单信息添加到订单数组中
			names [j]=name;
			dishmegs [j]=disMeg;
			times [j]=time;
			addresses[j]=adress;
			sumprices [j]=(sumPrices+diliCharge);
				break;	
				}
				if (isAdd==false) {    //isAdd为false表示餐袋已满，不能下单
					System.out.println("对不起，餐袋已满！");
				}
			}
			System.out.println(Arrays.toString(names));
			System.out.println(Arrays.toString(dishmegs));
			System.out.println(Arrays.toString(times));
			System.out.println(Arrays.toString(addresses));
			System.out.println(Arrays.toString(sumprices));
			break;
		case 2://执行查看订餐
			System.out.println("***查看餐袋***");
			//查看订单数组，显示下过的订单
			//显示格式：    序号  订餐人  餐品信息  送餐时间 送餐地址   总金额   订单状态
			System.out.println("序号"+"\t"+"订餐人"+"\t"+"餐品信息"+"\t"+"送达时间"+"\t"+"总金额"+"\t"+"订单状态");	
			int serial;
			for(serial=1;serial<=names.length;serial++) {
			System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+times[serial -1]+"\t"+sumprices [serial -1]+"\t"+states [serial -1]);
			}
			break;
			
		case 3:
			System.out.println("***签收订单***");
			 System.out.println("已选订单：");
		    for(serial=1;serial<=names.length;serial++) {
				System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+states [serial -1]);
		    }
		    System.out.println("请选择您需要签收的订单编号：");
			int dishnum=input.nextInt();
			boolean status=false;
			 do {
			  
				if(dishnum<=4 && dishnum>=1) {
				  if(names[dishnum -1]==null) {
					System.out.println("订单不存在!请重新输入：");
					dishnum=input.nextInt();
					status=true;
				    }else if (states [dishnum -1]==1) {
					System.out.println("订单已签收，请勿重复操作！");
					status=false;
				   }else if (names[dishnum -1]!=null){
					states [dishnum -1]=1;
					System.out.println("签收成功");
					status=false;
				   }
				}else {
					System.out.println("订单不存在!请重新输入：");
					dishnum=input.nextInt();
					status=true;
				}
				
			 }while(status=false);
			
			break;
		case 4:
			System.out.println("***删除订单***"); 
			 System.out.println("已存在订单：");
			    for(serial=1;serial<=names.length;serial++) {
					System.out.println(serial +"\t"+(names[serial -1])+"\t"+dishmegs[serial -1]+"\t"+states [serial -1]);
			    }
			    System.out.println("请选择您需要删除的订单编号：");
			   
			    
			    	int deletedish =input.nextInt();
			    	names [deletedish-1]=null;
					dishmegs [deletedish-1]=null;
					times [deletedish-1]=0;
					addresses[deletedish-1]=null;
					sumprices [deletedish-1]=0;
					states [deletedish-1]=0;
			    
			    System.out.println("已删除！");
			    
			    
			break;
		case 5:
			System.out.println("***我要点赞***");
			System.out.println("请选择需要点赞的订单");
			int pride =input.nextInt();
			praiseNums [pride-1]++;
			System.out.println("点赞成功，谢谢您");
			
			break;
//		case 6://退出系统
//			isExit=true;
//			break;
		default://功能编号错误默认退出系统
			System.out.println("***感谢使用！***");
			isExit=true;
			input.close();
			break;
		}
		
		
		
		if (!isExit) {//不退出系统，可以返回主菜单
			System.out.println("输入0返回主菜单：");
			num=input.nextInt();
		}else {//结束循环
			input.close();
			break;
		}
		
		
		}while(num==0);
	
		
		
	}

}
