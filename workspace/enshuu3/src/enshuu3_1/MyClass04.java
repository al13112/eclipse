package enshuu3_1;

public class MyClass04 {
	B myB = new B();
	myB.val = 50;
	A myA = myB;
	B other = (B)myA;
	otherB.show();
	System.out.println("VAL"+myB.val);
}
