import java.util.*;
public class RemoveDuplicates {

    public static int rdup(int[] a)
    {
    
        int rd=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[rd]!=a[i])
            {
                rd++;
                a[rd]=a[i];
            }
        }

       
        return rd;

    }
    public static void main(String[] args) {
        int arr[]={22,33,22,44,55,66,33};

        Arrays.sort(arr);
        int l=rdup(arr);

        for(int i=0;i<=l;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
