package Pattern;

import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=1&&j<=i)
                {
                    System.out.print(k);
                    k++;
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
