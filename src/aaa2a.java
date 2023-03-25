import java.util.ArrayList;
import java.util.List;

public class aaa2a {



    public static void main(String[] args) {
        int a[]={1,2,2,3,4};
        int i=0;
       for(int j=0;j<a.length;j++)
       {
           if(a[i]-1!=i)
           {
               int temp=a[i];
               a[a[i]-1]=a[i];
               a[i]=temp;
           }
           else if(a[i]-1==i&&a[i]==a[a[i]]-1)
           {
               i++;
           }
       }


       for(int k=0;k<a.length;k++)
       {
           System.out.print(a[i]+" ");
           System.out.println("hello there ");
       }

    }
}
