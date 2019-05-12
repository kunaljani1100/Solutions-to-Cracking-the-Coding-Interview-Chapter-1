package kunal;

/**
 * Created by kunal on 12-05-2019.
 */

import java.util.Scanner;

public class Q7 {
    public static void rotateMatrix()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the matrix:");
        int n=scanner.nextInt();
        System.out.println("Enter the elements of the matrix:");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scanner.nextInt();
            }
        }
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String []args)
    {
        rotateMatrix();
    }
}
