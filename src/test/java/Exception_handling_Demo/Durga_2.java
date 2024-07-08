package Exception_handling_Demo;

public class Durga_2 {
	
	public static void main(String[] args) {
		try {
			System.out.println(0/0);
			
		}catch(ArithmeticException e){
//			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e+"internaly to String() will be called");
			System.out.println(e.getMessage()+": it prints only description");
			
		}finally{
			System.out.println("printing finally class");
		}

}}
