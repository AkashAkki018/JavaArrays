package Arrays;

public class LargestInArray {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,99,4,5};
        int l=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>l)
            {
                l=arr[i];
            }
        }
        System.err.println(l);
    }
    
}
