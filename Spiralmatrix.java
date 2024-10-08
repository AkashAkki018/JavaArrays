import java.util.ArrayList;
import java.util.List;

class Spiralmatrix {

    public static List<Integer> spiral(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        List<Integer> result=new ArrayList<>();

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right)
            {
            for(int i=bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3},{4, 5, 6},  {7, 8, 9}};
        int n=matrix.length;
        
       List<Integer> l=spiral(matrix);
       System.out.println(l);

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
