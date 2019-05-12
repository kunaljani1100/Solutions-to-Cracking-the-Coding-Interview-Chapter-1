package kunal;

import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q4 {
    public static void checkPalindrome()
    {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Enter a string");
        string=scanner.nextLine();
        boolean isPalindrome=true;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)!=string.charAt(string.length()-1-i))//Checking for violation of condition.
            {
                isPalindrome=false;
            }
        }
        if(isPalindrome)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
    public static void main(String []args)
    {
        checkPalindrome();
    }
}
