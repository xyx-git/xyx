package time;
/*
 * ��дһ��Teacher�࣬������name��sex��
 * ��дtoString������Ҫ���ӡTeacher��Ķ���ʱ���ܹ����
 * ������:  name��sex��ֵ����
 * ��дequals������Ҫ��Ƚ�Teacher�����������ʱ��������ͬ���߶���������ֵһ��������true��
 * ���ڴ������ǰд��ע�ͣ�  toString��equals���������ĸ����ࡣ���Ҹ��������ǵĹ�����ʲô����˵����
 */
public class Teacher {
	private String name;
	private String sex;
	
	//�������췽����ʼ�� name  sex
	public Teacher(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
	//����toString 
	public String tostring() {	
		return "����:"+this.getClass().getSimpleName()+"  name:"+this.name+"  sex:"+this.sex;
	}
	//��дequals
	 public boolean equals(Object obj) {
		 //�ж��Ƿ���ڼ̳й�ϵ
		 if(obj instanceof Teacher) {
			 //�Ƚ�
			 if((((Teacher) obj).getSex()==this.getSex())&&(((Teacher) obj).getName()==this.getName())) {
				 return true;
			 }else {
				 return false;
			 }
		 }else {
			 return false;
		 }
		
	    } 
	//����
	public static void main(String[] args) {
		Teacher t=new Teacher("����", "��");
		System.out.println(t.tostring());
		Object obj=new Teacher("dd", "nan");
		System.out.println(t.equals(obj));
	}
	
}
