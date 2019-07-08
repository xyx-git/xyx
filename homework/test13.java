package homework;

public class test13 {

	public static void main(String[] args) {
		int a=0;
		int sum=0;
		
		
//	while 方式	
		while(a<=100) {
			a++;
			if(a%2==1) {
				continue;
			}
			sum=sum+a;
			
		}
		System.out.println(sum);
		
//  do-while 方式
		
		int m=0;
		int b=0;
		do {
			
			if(b%2==1) {
				b++;
				continue;
			}
			m=m+b;
			b++;
		}while(b<=100);
		System.out.println(m);
		
		
//		for  
		
		int n=0;
		for (int c=0;c<101;) {
			
			if(c%2==1) {
				c++;
				continue;
			}
			n=n+c;
			c++;
			
		}
		System.out.println(n);
		
		
		
		

	}

}
