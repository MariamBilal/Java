
public class InstanceVariable {
	String InstanceVar=" instance variable";
	
	   public static void main(String args[]){
		   InstanceVariable obj = new InstanceVariable();
		   InstanceVariable obj2 = new InstanceVariable();
		  
		System.out.println(obj.InstanceVar);
		System.out.println(obj2.InstanceVar);
		
		obj2.InstanceVar = "this is an instance variable";

		System.out.println(obj.InstanceVar);
		System.out.println(obj2.InstanceVar);
		
	   }

}
