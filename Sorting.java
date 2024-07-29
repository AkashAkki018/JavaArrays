

public class Sorting {
    public static void main(String[] args) {
        
        int a[]={33,45,6,44,22,3,5};
        System.out.println("Before Sorting");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        int temp;
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
        System.out.println();
        System.out.println("After Sorting");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    
}
