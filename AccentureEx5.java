public class AccentureEx5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mini=0;
        int maxi=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
                mini=i;
            }
            if(arr[i]>max)
            {
                max=arr[i];
                maxi=i;
            }
        }

        System.out.println("Max Number Index "+ maxi);
        System.out.println("Min Number Index "+ mini);
    }
}
