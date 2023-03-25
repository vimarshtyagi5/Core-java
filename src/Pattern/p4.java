package Pattern;

import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n/2;j++)
            {
                if(i<=n/2)
                {
                    if(j>=1&&j<=n/2-i+1)
                    {
                        System.out.print(n/2+1-j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else {

                    if(j>=1&&j<=i-n/2)
                    {
                        System.out.print(n/2+1-j);
                    }

                    else {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println();
        }

    }
}
