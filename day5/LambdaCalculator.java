package day5;
interface Calculator{
	double add(double a,double b);
}

public class LambdaCalculator {
	public static void main(String[] args) {
		 Calculator addition=(a,b) -> {
			 System.out.println("Addition");
			 double result=a+b;
			 System.out.println("result"+result);
			 return result;
		 };
		 //Calculator subtract=(a,b)->a-b;
		 double a=1000.0,b=2000.0;
		 addition.add(a, b);
	}

}
