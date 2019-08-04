package chapter9_carCental;
/*
 * 定义租赁管理接口
 *    包括租赁天数、折扣、租金
 */
public interface LeaseManagement {
	
	//定义方法	
	 int discount(int day) ;
	 int money(int day) ;
	 
}
