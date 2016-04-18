package enshuu3_1;

public class MyClass02 {
	public static void main(String[] args){
		B myB = new B();
		A myA = myB;
		myA.show();
		System.out.println("VAL"+myA.val);
	}
}
