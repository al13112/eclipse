package enshuu1_3;

public class FirstClass {
	static double x;
	FirstClass(){
		this.x = 4;
	}

  void square(){
		System.out.println(x*x);
	}
  static double mySqrt(){
	  return Math.sqrt(x);
  }
  static double mySqrt(double x){
	 return Math.sqrt(x * Math.PI);
  }
}


