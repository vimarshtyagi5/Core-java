class First11{
    int a=1;
    public void disp()
    {
        System.out.println("in class First11");
    }


}
class Second11 extends First11{

    int a=2;

    public void disp()
    { super.disp();  // what if we want to use the overridden method of class "First1"  as well!
                     // this will print disp() of "Fisrt11" before the "Second11"'s

            System.out.println("in class second11");

    }

}
public class P10_Inheritance_super_Keyword_Method extends First11 {
    public static void main(String[] args) {

        Second11 s=new Second11();
        s.disp();
       // P10_Inheritance_super_Keyword_Method p=new P10_Inheritance_super_Keyword_Method();
        First11 p= new First11();
        p.disp();

    }
}

//O/P
//        in class First11
//        in class second11
//        in class First11