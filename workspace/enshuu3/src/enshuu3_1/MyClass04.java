package enshuu3_1;

public class MyClass04 {

	public static void main(String[] args) {
		B myB = new B();
		myB.val = 50;
		A myA = myB;
		B otherB = (B)myA;
		otherB.show();
		System.out.println("VAL"+myB.val);
	}
}
