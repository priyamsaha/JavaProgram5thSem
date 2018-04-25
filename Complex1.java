import MyPack.*;
import java.util.Scanner;
class Complex1{
	public static void main(String args[])
	{
		int r,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE 1st COMPLEX NO.::");
		r=sc.nextInt();
		i=sc.nextInt();
		System.out.println("ENTER THE 2nd COMPLEX NO.::");
		int r1=sc.nextInt();
		int i1=sc.nextInt();
		Complex c=new Complex(r,i);
		c.show();
		Complex c1=new Complex(r1,i1);
		c1.show();
		c=c.addComplex(c1);
		c.show();
	}
}
