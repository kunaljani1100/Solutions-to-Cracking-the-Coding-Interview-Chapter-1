package kunal;

import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q9 {

    public static void checkRotation()
    {
        Scanner scanner=new Scanner(System.in);
        String string1,string2;
        System.out.println("Enter string 1:");
        string1=scanner.nextLine();
        System.out.println("Enter string 2:");
        string2=scanner.nextLine();
        boolean isRotation=false;
        if(string1.length()!=string2.length())//Check if 2 strings are equal or not.
        {
            isRotation=false;
        }
        else
        {
            int k;
            for(int i=0;i<string1.length();i++)
            {
                k=i;
                boolean flag=true;
                for(int j=0;j< string1.length();j++)
                {
                    if(j+k<string1.length())
                    {
                        if (string1.charAt(j) != string2.charAt(j + k))//Checking the equality of characters for each length of rotation.
                        {
                            flag = false;
                            break;
                        }
                    }
                    else
                    {
                        if(string1.charAt(j) != string2.charAt(j+k-string1.length()))
                        {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    isRotation=true;
                    break;
                }
            }
        }
        if(isRotation)
        {
            System.out.println("The strings are rotations.");
        }
        else
        {
            System.out.println("The strings are not rotations.");
        }
    }
    public static void main(String []args)
    {
        checkRotation();
    }
}
