package Wipro_selenium;

class Utils {
    public static int add(int x, int y) {
        return x + y;
    }
}

public class StaticMethods {
	 public static void main(String[] args) {
	        int sum = Utils.add(5, 7);  // no object creation needed
	        System.out.println(sum);    // prints 12
	    }


}
