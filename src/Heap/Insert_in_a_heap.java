package Heap;

public class Insert_in_a_heap {


    public static void delete(int [] a, int n)
    { int i=1;
        a[1]=a[n];
        a[n]=0;
        while(i<n)
      {
          int left=a[2*i];
          int right=a[2*i+1];

          int x=left>right?2*i:2*i+1;
          if(a[i]>x) {
              swap(a, i, x);
              i=x;

          }
          else
          {
              return;
          }

      }
    }

    public static void swap(int a[], int i,int x)
    {
        int temp=a[i];
        a[i]=a[x];
        a[x]=temp;


    }
    public static void main(String[] args)
    {  int a[]={0,40,30,10,20,15};


       delete(a,a.length-1);

       for(int i=1;i<a.length-1;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
}
