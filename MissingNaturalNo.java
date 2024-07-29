import java.util.Scanner;

public class MissingNaturalNo {

    public static int find(int[] arr,int N)
    {
        int sum= N * (N+1)/2;

        int arrsum=0;

        for(int i=0;i<arr.length;i++)
        {
            arrsum=arrsum+arr[i];
        }

        return sum-arrsum;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter N value");
        
        int N=sc.nextInt();

        int arr[]=new int[N-1];

        System.out.println("Enter Elements");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Missing Value : "+find(arr,N));
    }
}
