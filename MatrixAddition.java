
import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int add[][]=new int[3][3];
        System.out.println("Enter first matrix elements");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.err.println("After addition");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(add[i][j]);
            }
            System.out.println();
        }


        
    }
}
