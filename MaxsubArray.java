public class MaxsubArray {
    
    public static int subarraymax(int[] arr)
    {
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
            

        }

        return maxsum;
    }

    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subarraymax(arr));

    }
}
