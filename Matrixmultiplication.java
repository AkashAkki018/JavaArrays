
public class Matrixmultiplication {

    public static void main(String[] args) {
        
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 

        int m[][]=new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                m[i][j]=0;
                for(int k=0;k<a.length;k++)
                {
                    m[i][j]=m[i][j]+a[i][k]*b[k][j];
                }
            }
        }

       
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }


        
    }
    
}
