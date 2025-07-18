package Wipro_selenium;

public class CalculatoRuntimeData {
	 public int add(int a, int b) {
	        return a + b;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatoRuntimeData cal=new CalculatoRuntimeData();
		 int sum = cal.add(3, 4);
	     System.out.println("Sum = " + sum);

	}

}
