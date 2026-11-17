package Methods;

public class ParameterAndReturnValue {
	
	static int addNumbers(int a, int b)
	{
		
		int result = a+b;

		return result;
	}
	
	
	
	public static void main(String[] args) {
		int total =  addNumbers(6, 15);
		
		System.out.println(total);
	}
}
