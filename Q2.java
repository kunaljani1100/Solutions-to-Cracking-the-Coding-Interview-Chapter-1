package kunal;

/**
 * Created by kunal on 12-05-2019.
 */

import java.util.Scanner;

public class Q2 {
    public static void checkPermutation() {
        String string1, string2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        string1 = scanner.nextLine();
        System.out.println("Enter second string:");
        string2 = scanner.nextLine();
        //char a='a';
        //int b=a;
//        System.out.println(b);
        boolean isPermutation = true;
        if (string1.length() != string2.length()) {
            isPermutation = false;
        } else {
            int count1[] = new int[26], count2[] = new int[26];
            for (int i = 0; i < count1.length; i++) {
                count1[i] = 0;
                count2[i] = 0;
            }
            for (int i = 0; i < string1.length();i++)
            {
                count1[string1.charAt(i)-97]++;//Count the occurence of each character
                count2[string2.charAt(i)-97]++;
            }
            for(int i=0;i<count1.length;i++)
            {
                if(count1[i]!=count2[i])//If the number of occurences for each character are not equal, then stop.
                {
                    isPermutation=false;
                    break;
                }
            }
        }
        if(isPermutation)
        {
            System.out.println("The two strings are permutations of each other");
        }
        else
        {
            System.out.println("The two strings are not permutations of each other.");
        }
    }
    public static void main(String []args)
    {
        checkPermutation();
    }
}