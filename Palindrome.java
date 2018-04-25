import java.util.Scanner;
class Palindrome{
	public static void main(String agrs[]){
		Scanner sc=new Scanner(System.in); 
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		if(s1.equalsIgnoreCase(s2))
			System.out.println(s1+" is a palindrome");
		else
			System.out.println(s1+" is not a palindrome");
		String s="abc";
		System.out.println(s.charAt(1));
		}
	}
