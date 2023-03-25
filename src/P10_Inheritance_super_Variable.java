class First1{
    int a=1;
    int b=3;
}
class Second1 extends First1{
    int a=2;
    public void disp()
   {
       System.out.println(a);

       // what if we want to use the variable "a" of class "First1"  as well!
       System.out.println(super.a);
       System.out.println(b);
   }

}

public class P10_Inheritance_super_Variable {
    public static void main(String[] args) {

        Second1 s=new Second1();
        s.disp();

    }
}


// O/P:-
 //       2
 //       1