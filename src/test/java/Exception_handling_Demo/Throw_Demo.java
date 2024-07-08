package Exception_handling_Demo;

public class Throw_Demo {
	
	public static void main(String[] args)throws InterruptedException   {
		
		Thread.sleep(200);
		
		
		throw  new NullPointerException("division by zero");
		
	}

}
