package Searching;

public class Binary_search {

    public static void main(String[] args)
    {
        int a[] ={1,2,3,4,5,6,7,8,9};

        int l=0;
        int r=a.length-1;
        int mid;
        int key=7;
        while(l<=r)
        { mid=(l+r)/2;
          if(a[mid]==key)
          {
              System.out.println(mid+" ");
              break;
          }
         else if(a[mid]<key)
          {
              l=mid+1;

          }
          else
          {
              r=mid-1;
          }


        }
    }
}
