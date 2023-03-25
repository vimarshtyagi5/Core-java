package Searching;

public class linear {
    public static void swap(int[] a, int i, int correctIndextobe) {

        int temp=a[i];
        a[i]=a[correctIndextobe];
        a[correctIndextobe]=temp;

    }


    public static void main(String[] args) {
        int key = 5;
        int[] arr = {2, 3, 1, 5, 1};


        int i = 0;
        int len = arr.length;
        while (i < len) {
            int value = arr[i];
            int correctIndexToBe = value - 1;
            if ((i + 1) != value) {
                if (arr[i] == arr[value - 1])   // in case of duplicate value
                {
                    i++;      // just increase 'i' forward
                    continue;
                }
                swap(arr, i, correctIndexToBe);
            } else {
                i++;
            }
        }


        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]-1!=k)
            {
                System.out.println(k+1);
            }
        }
    }
}
