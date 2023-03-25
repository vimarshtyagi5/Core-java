package Recursion;

public class R_check {
    static int x=0;
    public static void f()
    {
        if(x==3)
        {
          return;
        }

        x++;
        System.out.println(x);
        f();

    }
    public static void main(String[] args) {
        f();
    }
}
