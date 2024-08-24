

public class CopyElemnets {

    public static void main(String[] args) {
        
        int original[]={1,2,3,4,5};
        int copy[]=new int[5];

        for(int i=0;i<copy.length;i++)
        {
            copy[i]=original[i];
        }

        System.out.println("Elements of original Array");
        
        for(int i=0;i<copy.length;i++)
        {
            System.err.print(original[i]+" ");
        }
        System.out.println();
        System.out.println("Elements of copy array");

        for(int i=0;i<copy.length;i++)
        {
            System.err.print(copy[i]+" ");
        }

    }
    
}
