package enshuu2_1;

public class Car {
	double speed =0.0;
	Car(double speed){
		this.speed = speed;
		System.out.println("時速は"+speed+"です。");
	}
	Car(){
		Car c =new Car(40.0);
		System.out.println("車だ！");
	}
}
