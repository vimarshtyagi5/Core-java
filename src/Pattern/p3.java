package Pattern;

import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n/2+1;j++)
            {
                if(i<=n/2+1)
                {
                    if(j>=1&&j<=i)
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

                else
                {
                    if(j>=1&&j<=n-i+1)
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }

    }
}
