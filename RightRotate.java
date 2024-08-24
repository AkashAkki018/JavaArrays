
public class RightRotate {
    public static void main(String[] args) {
        
        int a1[]={1,2,3,4,5,6};
        

        int n=2;
        for(int i=0;i<n;i++)
        {
            int j,last;
            last =a1[0];
            for( j=0;j<a1.length-1;j++)
            {
                a1[j]=a1[j+1];
            }

            a1[j]=last;
        }

        for(int a:a1)
        {
            System.out.println(a+" ");
        }
    }
}
