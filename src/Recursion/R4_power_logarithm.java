package Recursion;

public class R4_power_logarithm {
    public static int pow(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n%2==0)
        {
            return pow(x,n/2)*pow(x,n/2);
        }
        else
        {
            return x*pow(x,n/2)*pow(x,n/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2,7));
    }

}
