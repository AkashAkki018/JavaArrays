public class SecondLargestElement {

    public static int SecondLargest(int[] a)
    {
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        return a[a.length-2];

    }

    public static void main(String[] args) {
        
        int arr[]={11,23,44,22,46,99,88};
        int s=SecondLargest(arr);
<<<<<<< HEAD
        System.out.println("Second Largest"+s);
=======
        System.out.println("Second Largest "+s);
>>>>>>> ac6cdbd (14-7-24)
    }
    
}
