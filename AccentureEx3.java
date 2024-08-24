/*
Question 4: Nearest Integer 
Int nearestInteger(int num, int m) 
The function accepts two positive ‘num’ and ‘m’ as its argument, Implement 
the following function to find the nearest integer to num. 
1) Number is divisible by m. 
2) Number is nearest to ‘num’ (Have the least distance from num) 
Note: If there are two numbers with the least distance from num, then return 
the larger num. 
Input 1: Num= 67 
M = 8 
Output 1: 64 
Input 2: Num=26 
M=3 
Output 2: 27

*/

import java.util.Scanner;

public class AccentureEx3 {

    public static int nearest(int n,int m)
    {
        int quotient=n/m;
        int n1=quotient * m;
        int n2=(quotient+1) * m;

        int distance1=Math.abs(n-n1);
        int distance2=Math.abs(n-n2);

        return distance1 > distance2 ? n2 : n1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        int Num=sc.nextInt();
        System.out.println("Enter M");
        int M=sc.nextInt();
        System.out.println(nearest(Num, M));

    }
    
}
