import java.util.Scanner;
import java.lang.Exception;
class MyExcept extends Exception{
	MyExcept(String s)
	{
		super(s);
	}
}
class Except{
	public static void main(String args[])
	{
		System.out.println("ENTER A NUMBER::");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		try{
			if(n<10000)
				throw new MyExcept("AMNT TOO SMALL");
				
			else
			{
				n=n+(n*10/100);
				System.out.println("BONUS ADDED::"+n);
			}
				
		}	
		catch(MyExcept e){
			System.out.println("EXCEPTION CAUGHT");
			System.out.println(e.getMessage());
		}
}
}
