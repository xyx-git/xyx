package day02_practic;

import java.util.Scanner;

public class test08_tools {
		
	 public int tools1(int t1){
		 
		
		 int m=(int) (Math.random()*t1)+1;
		 return m;
	 }
	 
	 public long tools2(){
		long n= System.currentTimeMillis() ;
		return n;
	 }
	 public int tools3(int t3) {
		
		int sum=0;
		 for(int i=1;i<=t3;i++) {
			 sum+=i;
		 }
		 return sum;
	 }
	 
	 public int tools4 (int t4)) {
		
			int nul=1;
			 for(int i=1;i<=t4;i++) {
				 nul=nul*i;
			 }
			 return nul;
		 }
	 
	 public static void main(String[] args) {
		 test08_tools t=new test08_tools();
		 t.tools1(5);
		 t.tools2();
		 t.tools3(5);		 
		 t.tools4(5);
	}
	 
}
