package Overloading;

public class main {

	public static void main(String[] args) {
		
		Method_Overloading obj = new Method_Overloading();
		
		int r1 = obj.add(3, 5);
		System.out.println(r1);
		
		
		int r2 = obj.add(2, 3, 6);
		System.out.println(r2);

	}

}
