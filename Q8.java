package kunal;

/**
 * Created by kunal on 12-05-2019.
 */

import java.util.Scanner;

public class Q8 {
    public static void replaceWithZeros()
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
        for(int i=0;i<n;i++)//First assign the new matrix with all the old values.
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[i][j];
            }
        }
        for(int i=0;i<n;i++)// And then assign zero to the entire row and column number if the element at a particular
            //location is zero.
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    for(int k=0;k<n;k++)
                    {
                        b[i][k]=0;
                        b[k][j]=0;
                    }
                }
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
        replaceWithZeros();
    }
}


