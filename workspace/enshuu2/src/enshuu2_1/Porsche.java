package enshuu2_1;

public class Porsche extends Car{

	Porsche(){
		System.out.println("ポルシェだ！");
	}

	Porsche(double speed){
		super(speed);
		System.out.println("時速は"+speed+"です!");
	}


}
