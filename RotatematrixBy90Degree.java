public class RotatematrixBy90Degree {

    public static void rotate90(int[][] matrix)
    {
        int n=matrix.length;
        //firrst tansposing the given matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //then reverse each row
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
    

    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3},{4, 5, 6},  {7, 8, 9}};
        int n=matrix.length;
        
        rotate90(matrix);

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
