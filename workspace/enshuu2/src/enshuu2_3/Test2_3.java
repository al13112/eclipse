package enshuu2_3;

public class Test2_3 {
	public static void main(String args[]){
		try{
			//Div w = new Div(4,5);
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i/j);
		}
		catch(ArithmeticException e){
			System.out.println("0で割ることはできません。");
		}
		catch(NumberFormatException e){
			System.out.println("数字以外で割ることはできません");
		}

	}
}
