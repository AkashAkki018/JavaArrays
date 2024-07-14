package Arrays;

public class LeftRotateOfElements {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};

        int n=2;
        System.out.println("Before");

        for(int i=0;i<arr.length;i++)
        {
            System.err.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++)
        {
            int first,j;
            first=arr[0];

            for(j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;

        }

       

        System.out.println();

        System.out.println("After");

        for(int i=0;i<arr.length;i++)
        {
            System.err.print(arr[i]+" ");
        }

    }
    
}
