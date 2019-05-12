package kunal;

/**
 * Created by kunal on 12-05-2019.
 */
import java.util.Scanner;
public class Q1 {
    public static void checkUniqueness()
    {
        String string;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        string=scanner.nextLine();
        boolean isUnique=true;
        for(int i=0;i<string.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(string.charAt(i)==string.charAt(j)) //Check if the characters before the current position matches the same character
                //or not.
                {
                    isUnique=false;
                    break;
                }
            }
            if(!isUnique)
            {
                break;
            }
        }
        if(isUnique)
        {
            System.out.println("All characters are unique.");
        }
        else
        {
            System.out.println("All characters are not unique.");
        }
    }
    public static void main(String []args)
    {
        checkUniqueness();
    }
}
