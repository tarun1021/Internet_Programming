package practiceQuestions;
import java.util.Scanner;
public class Test0 {
	static int a;
	static int b;
	static int c;
	static Scanner sc=new Scanner(System.in);
    public static void setData()
    {
    	System.out.print("Enter two numbers");
    	a=sc.nextInt();
    	b=sc.nextInt();
    }
    public static void showResult()
    {
    	 try
    	    {
    	      c = a/b;
    	      System.out.println(c);  
    	    }
    	    catch(ArithmeticException e)
    	    {
    	      System.out.println("Do not divide by zero"  + e );
    	    }
    	 catch(NumberFormatException  ex)
    	    {
    		 System.out.println("Invalid number." + ex );   
    	    }
    }
	public static void main(String[] args) {
		setData();
		showResult();
	}

}
