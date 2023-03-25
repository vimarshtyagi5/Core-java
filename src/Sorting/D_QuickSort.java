package Sorting;

public class D_QuickSort {
    public static void swap(int [] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        int l=0;
        int h=a.length-1;

        quick_sort(a,l,h);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }

    }

    private static void quick_sort(int[] a, int l, int h) {

        if(l<h)
        {   int pivot=a[h];
            int pivot_idx=partitions(a,pivot,l,h);

            quick_sort(a,l,pivot_idx-1);
            quick_sort(a,pivot_idx+1,h);

        }
    }

    public  static int partitions(int[] a,int pivot, int l, int h) {

        int i=l;
        int j=l;
        while(i!=a.length)
        {
            if(a[i]>pivot)
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

        return j-1;





    }
}
