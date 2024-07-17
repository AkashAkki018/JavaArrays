public class TwoSum {

    public static int[] tsum(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return null;

    }
    public static void main(String[] args)
    {
        int arr[]={2,7,11,5};
        int target=13;
        int res[]=tsum(arr,target);

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }


    }
    
}
