package enshuu1_2;

public class FirstClass {
	double x;
	FirstClass(){
		this.x = 4;
	}
	FirstClass(double x){
		this.x = x;
	}

  void square(){
		System.out.println(x*x);
	}
  double mySqrt(){
	  return Math.sqrt(x);
  }
  double mySqrt(double x){
	 return Math.sqrt(x * Math.PI);
  }
}


