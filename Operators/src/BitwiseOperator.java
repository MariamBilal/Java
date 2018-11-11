
public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 22;  
	     int num2 = 33;  
	     int result = 0;

	     result = num1 & num2;   
	     System.out.println("num1 & num2: "+result);

	     result = num1 | num2;   
	     System.out.println("num1 | num2: "+result);
	    
	     result = num1 ^ num2;   
	     System.out.println("num1 ^ num2: "+result);
	    
	     result = ~num1;   
	     System.out.println("~num1: "+result);
	    
	     result = num1 << 2;   
	     System.out.println("num1 << 2: "+result); result = num1 >> 2;   
	     System.out.println("num1 >> 2: "+result);

	}

}
