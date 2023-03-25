package Recursion;

public class R1_Print_1to_n_numbers {
    public static void print(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        else
        {   System.out.println(n);
            print(n-1);

        }


    }
    public static void main(String[] args)
    {
        print(7);
    }
}
