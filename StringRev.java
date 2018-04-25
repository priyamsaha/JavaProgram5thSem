import java.util.Scanner;
class Stringrev{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY STRING");
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println("Reversed String::"+sb);
	}
}
		
