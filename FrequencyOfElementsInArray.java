package Arrays;

<<<<<<< HEAD
=======

>>>>>>> ac6cdbd (14-7-24)
public class FrequencyOfElementsInArray {

    public static void main(String[] args) {
        
        int arr1[]={2,3,4,5,2,2,4,6};

        int arr2[]=new int[arr1.length];

        int visited=-1;

        for(int i=0;i<arr1.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    count++;
                    arr2[j]=visited;
                }

            }

            if(arr2[i]!=visited)
                {
                    arr2[i]=count;
                }

        }

        for(int i=0;i<arr1.length;i++)
        {
            if(arr2[i]!=visited)
            {
                System.out.println(arr1[i]+ "  "+ arr2[i]);
            }
        }
    }
    
}
