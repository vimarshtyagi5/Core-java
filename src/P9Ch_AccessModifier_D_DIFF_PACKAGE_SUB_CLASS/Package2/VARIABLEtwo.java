package P9Ch_AccessModifier_D_DIFF_PACKAGE_SUB_CLASS.Package2;


import P9Ch_AccessModifier_D_DIFF_PACKAGE_SUB_CLASS.Package1.VARIABLE;

public class VARIABLEtwo{  // Isme humne "EXTENDS" lagaya qki ye ek sub-class hai "DIFF PACKAGE" mai
public static void main(String[] args) {
     VARIABLE v= new VARIABLE();

     System.out.println("value of A="+v.a);  // this is public
//     System.out.println("value of A="+v.b);// we can't access it because it is a "PROTECTED" access in its ownclass
//                                           // of different package
//     System.out.println("value of A="+v.c);// we can't access it because it is a "DEFAULT" access in its ownclass
//                                           // of different package
//     System.out.println("value of A="+v.d);// we can't access it because it is a "PRIVATE" access in its ownclass
                                             // of different package

//    public int y=c; // we can't access it because it is a "deafult" access in its own "Parent class" of different package
//    public int z=d;

     }
}
