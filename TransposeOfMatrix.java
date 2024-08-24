public class TransposeOfMatrix {

    public static void transpose(int[][] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3},{4, 5, 6},  {7, 8, 9}};
        int n=matrix.length;
        
        transpose(matrix);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
