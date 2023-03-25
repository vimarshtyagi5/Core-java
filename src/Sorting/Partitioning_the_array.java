package Sorting;

public class Partitioning_the_array {
    public static void swap(int [] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args)
    {
        int a[]={7,9,4,8,6,2,5,3,10,11,1,2,3};

        int i=0;
        int j=0;
        int piv=5;
        while(i!=a.length)
        {
            if(a[i]>piv)
            {
                i++;
            }
            else
            {
                swap(a,i,j);
                i++;
                j++;
            }
        }
        System.out.println(j-1);
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
