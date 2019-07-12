package day02_practic;

public class test_05print {
	int [] [] arr=new int [1][1];
   public test_05print (int[][] q) {
	
	   if (q[1][0]>q[0][0]) {
    	for(int i=q[0][0];i<=q[1][0];i++) {
    		System.out.print(i+" ");
    		    	}  
    	System.out.println();
	   }else {
		   for(int i=q[0][0];i>=q[1][0];i--) {
	    		System.out.print(i+" ");
	    	}  
		   System.out.println();
	   }
    }
   public static void main(String[] args) {
	   int[][] arr1= {{1},{6}};
	   int[][] arr2= {{6},{1}};
	test_05print output1=new test_05print(arr1 ) ;
	test_05print output2=new test_05print(arr2 ) ;
	test_05print output3=new test_05print(arr2 ) ;	  
	test_05print output4=new test_05print(arr1 ) ;   
	   
	   
}
  
   	}    	
   
