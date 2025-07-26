package day6;

interface A{
	void run();
}

interface B extends A{
	void run();
	
}

interface C extends B{
	void run();
}

class Implementation implements C{
	public void run() {
		System.out.println("run");
		
	}
	
}
public class ExampleInterface  {
	public static void main(String[] args) {
		Implementation i=new Implementation();
		i.run();
		
		
	}
	
	

}
