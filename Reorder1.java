import java.util.Scanner;
public static void main(String[] args)
    {
        String result = "";
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();

        for(int i = 1; i < input.length(); i++)
        {
            if(input.charAt(i-1) < input.charAt(i))
                result += input.charAt(i-1);
            //else 
            //  result += input.charAt(i);
        }
        System.out.println(result);
    }


}