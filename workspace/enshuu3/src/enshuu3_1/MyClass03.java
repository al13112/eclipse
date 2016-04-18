package enshuu3_1;

public class MyClass03 {
	public static void main(String[] args){
		A myA = new A();
		B myB = myA;
		myB.show();
		System.out.println("VAL"+myB.val);
	}
}
