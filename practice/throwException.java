package ExceptionHandling.practice;
import java.io.FileNotFoundException;
public class throwException {
	

	
	    void show() throws NullPointerException{
	        throw new NullPointerException("Test Exception");
	    }

	    void fly() throws FileNotFoundException {
	        throw new FileNotFoundException("You don't have wings to fly");
	    }

	    public static void main(String[] args)  {
	         throwException oo =new throwException();
	        try{
	            oo.show();
	            oo.fly();
	        } catch (Exception ee){

	        }
	        System.out.println("Test message");
	    }

}
