
public class StaticVariable {
	public static String StaticVar = "variable";
	
	public static void main (String args[]) {
		StaticVariable obj = new StaticVariable();
		StaticVariable obj1 = new StaticVariable();
		
		System.out.println(obj.StaticVar);
		System.out.println(obj1.StaticVar);
		
		obj.StaticVar = "this is a static variable";
		
		
		System.out.println(obj.StaticVar);
		System.out.println(obj1.StaticVar);

	}

}
