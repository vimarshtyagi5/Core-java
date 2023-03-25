package Pattern;

import java.util.Scanner;

public class p12 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int k=0;
        int n= s.nextInt();

        for(int i=1;i<=n;i++)
        {  k=i;
            for(int j=1;j<=n;j++)
            {
                if(j>=1&&j<=i)
                {
                    System.out.print(k+" ");
                    k+=5;
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
