package Sorting;

public class Heap_sort {
  public static void build(int arr[] ,int N)
  {
      for(int i=N/2;i>0;i--)
      { heapify(arr, arr.length-1,i);}
  }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
   public static void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i ; // left = 2*i + 1
        int r = 2 * i + 1; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,N,largest);
            // Recursively heapify the affected sub-tree
        }
    }



    // Driver's code
    public static void main(String args[])
    {
        int arr[] = { -1,12, 11, 13, 5, 6, 7 };
        int N = arr.length;

        int b[]=new int[arr.length];
         build(arr,N);
         for(int i=0;i<b.length;i++)
         {
             b[i]=arr[1];
             arr[1]=arr[arr.length-1];
             arr[arr.length-1]=0;

             build(arr,N);
         }

        System.out.println("Sorted array is");


        for (int i = 0; i < N;i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}