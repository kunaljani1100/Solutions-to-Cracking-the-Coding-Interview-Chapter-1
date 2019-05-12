package kunal;

/**
 * Created by kunal on 12-05-2019.
 */

import java.util.Scanner;

public class Q3 {
    public static void relapceSpaces()
    {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter string");
        string=scanner.nextLine();
        char str[]=new char[100];
        int count=0;
        for(int i=0;i<string.length();i++) {
            if (string.charAt(i) == ' ') {
                str[count++]='%';
                str[count++]='2';
                str[count++]='0';
            } else {
                str[count++]=string.charAt(i);
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(str[i]);
        }
    }
    public static void main(String []args)
    {
        relapceSpaces();
    }
}
