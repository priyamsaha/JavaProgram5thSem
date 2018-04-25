import java.util.Scanner;
class Reorder{
	public static void main(String args[])
	{	
		String r="";
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		for(int i = 0; i < s1.length()-1; i++)
        	{
        		for(int j=0;j<s1.length()-i-1;j++)
        		{
        			if(sb.charAt(j)<sb.charAt(j-1))
        			{
        				
        			}
        		}
		System.out.println(r);
        	}
		
	}
}
				
