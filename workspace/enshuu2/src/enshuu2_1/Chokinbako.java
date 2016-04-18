package enshuu2_1;

public class Chokinbako {
	int okane =0;
	//public int x=50;
	boolean available = true;

	private int setOkane(int x){
		okane = okane + x;
		System.out.println(okane);
		return okane;
	}
	private int getOkane(){
		boolean available = false;
		return okane;
	}
}
