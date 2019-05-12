package kunal;

import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q5 {
    public static void checkEdits()
    {
        Scanner scanner=new Scanner(System.in);
        String string1,string2;
        System.out.println("Enter string 1");
        string1=scanner.nextLine();
        System.out.println("Enter string 2");
        string2=scanner.nextLine();
        int countEdits=0;
        if(string1.length()==string2.length())
        {
            for(int i=0;i<string1.length();i++)
            {
                if(string1.charAt(i)!=string2.charAt(i))//detecting edits when strings are equal
                {
                    countEdits++;
                }
            }
        }
        else if(string1.length()==string2.length()-1 || string2.length()==string1.length()-1)//detecting edits when strings are not equal
        {
            if(string1.length()==string2.length()-1)
            {
                for(int i=0;i<string1.length();i++)
                {
                    if(string1.charAt(i)!=string2.charAt(i) && countEdits==0)
                    {
                        countEdits++;
                    }
                    if(string1.charAt(i)!=string2.charAt(i+1) && countEdits==1)
                    {
                        countEdits++;
                    }
                }
            }
            if(string2.length()==string1.length()-1)
            {
                for(int i=0;i<string2.length();i++)
                {
                    if(string2.charAt(i)!=string1.charAt(i) && countEdits==0)
                    {
                        countEdits++;
                    }
                    if(string2.charAt(i)!=string1.charAt(i+1) && countEdits==1)
                    {
                        countEdits++;
                    }
                }
            }
        }
        if(countEdits==0 || countEdits==1)
        {
            System.out.println("0 or 1 edits away");
        }
        else
        {
            System.out.println("Not 0 or 1 edits away");
        }
    }
    public static void main(String []args)
    {
        checkEdits();
    }
}
