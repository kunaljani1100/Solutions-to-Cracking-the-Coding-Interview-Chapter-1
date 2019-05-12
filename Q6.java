package kunal;

import java.util.Scanner;
/**
 * Created by kunal on 12-05-2019.
 */
public class Q6 {
    public static void compressString()
    {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Enter string:");
        string=scanner.nextLine();
        char compressedString[]=new char[2*string.length()];
        int count=0;
        //int lowerLimit=0;
        int noOfOccurences=1;
        try {
            for (int i = 1; i < string.length()+1; i++) {
                if (string.charAt(i) == string.charAt(i - 1)) {
                    noOfOccurences++;
                } else {
                    compressedString[count++] = string.charAt(i - 1);
                    String s = Integer.toString(noOfOccurences);
                    for (int j = 0; j < s.length(); j++) {
                        compressedString[count++] = s.charAt(j);
                    }
                    noOfOccurences = 1;
                }
                //System.out.println(noOfOccurences);
            }
            //System.out.println();
            for (int i = 0; i < count; i++) {
                System.out.print(compressedString[i]);
            }
        }
        catch (IndexOutOfBoundsException e)
        {
            compressedString[count++]=string.charAt(string.length()-1);
            //noOfOccurences++;
            String s = Integer.toString(noOfOccurences);
            for (int j = 0; j < s.length(); j++) {
                compressedString[count++] = s.charAt(j);
            }
        }
        finally {
            for (int i = 0; i < count; i++) {
                System.out.print(compressedString[i]);
            }
        }
    }
    public static void main(String []args)
    {
        compressString();
    }
}
