public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
            

        int r=0,c=0,rows=matrix.length,cols=matrix[0].length;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    if(i==0) r=1;
                    if(j==0) c=1;
                }
            }
        }

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        if(r==1)
        {
           for(int j=1;j<cols;j++)
           {
            matrix[0][j]=0;
           }
        }
         if(c==1)
        {
           for(int i=1;i<rows;i++)
           {
            matrix[i][0]=0;
           }
        }

        
}
}
