package come.baidu.pay.market;   //包名


public class User {    //创建用户类
	
	private int account;//账号
    private String name;//用户名
	private int password;//密码
	private String adress;//地址
	
	
	
	
	//获取  设置 用户信息
   public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
  