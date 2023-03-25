package P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package1;

import P9Ch_AccessModifier_B_SAME_PACKAGE_NON_SUB_CLASS.VARIABLE;
import P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package2.VARIABLEtwo;

public class MAIN extends VARIABLEtwo // Isme humne "EXTENDS" lagaya qki ye ek sub-class hai
{
    public static void main(String[] args) {

        VARIABLEtwo vip=new VARIABLEtwo();

        System.out.println("A ="+vip.a);
        System.out.println("B ="+vip.b);
   //     System.out.println("C ="+vip.c);  // we can't access it because it is a "DEFAULT" access
                                          // in its own "Parent class" of different package
   //     System.out.println("D ="+vip.d);  // we can't access it because it is a "private" access
                                            // in its own "Parent class" of different package

    }



}
