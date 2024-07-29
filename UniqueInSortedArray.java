public class UniqueInSortedArray {

    public static int find(int[] arr)
    {
        int r=0;
        for(int i=0;i<arr.length;i++)
        {
            r=r^arr[i];
        }
        return r;

    }
    public static void main(String[] args) {

        int arr[]={1,1,2,2,4};

        System.out.println("Unique Elment : " +find(arr));
        
        
    }
    
}
