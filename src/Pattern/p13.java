package Pattern;

import java.util.Scanner;

public class p13 {

    public static int fact(int a)
    {  int fac=1;
        for(int i=1;i<=a;i++)
        {
            fac=fac*i;
        }

        return fac;
    }

    public static int p(int a, int b )
    {
       return (fact(a)/(fact(b)*fact(a-b)));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        boolean k=true;

        for(int i=0;i<=n;i++)
        { int l=0;

            for(int j=0;j<=2*n-1;j++)
            {
                if(j>=n-i+1&&j<=n+i-1&&k)
                {
                    System.out.print(p(i-1,l));

                    l++;
                    k=false;

                }

                else {
                    System.out.print(" ");
                    k=true;
                }

            }
            System.out.println();
        }

    }
}
