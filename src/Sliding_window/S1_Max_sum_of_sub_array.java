package Sliding_window;

public class S1_Max_sum_of_sub_array {

    public static void main(String[] args) {
        int a[]={2,3,5,2,9};
        int i=0,j=0;
        int k=3;
         int sum=0,max=0;
        while(j<a.length)
        { sum=sum+a[j];
            if(j-i+1<k)
            {

                j++;

            }

           else if(j-i+1==k)
            {
                //System.out.println(sum);
                if(sum>max)
                {
                    max=sum;
                }
                sum=sum-a[i];
                i++;
                j++;

            }
        }

        System.out.println(max);
    }
}
