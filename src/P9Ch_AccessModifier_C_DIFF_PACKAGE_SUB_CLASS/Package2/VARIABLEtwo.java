package P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package2;


import P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package1.VARIABLE;

public class VARIABLEtwo  extends VARIABLE
{
    public int w=a;
    public int x=b;
//    public int y=c; // we can't access it because it is a "deafult" access in its own "Parent class" of different package
//    public int z=d; // we can't access it because it is a "private" access in its own "Parent class" of different package

}
