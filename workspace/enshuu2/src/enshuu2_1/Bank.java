package enshuu2_1;

public class Bank {
	public int okane = 0;
	//public int x = 50;
	private int setOkane(int x){
		okane = okane + x;
		System.out.println(okane);
		return okane;
	}
	private int getOkane(){
		return okane;
	}
	private int Furikomi(int x){
	okane = okane - x;
	return okane;
	}

}
