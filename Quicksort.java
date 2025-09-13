public class Quicksort {
    public static int partion(int low,int high,int[]arr)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;


        return i;
    }
    public static void quickSort(int low,int high,int arr[])
    {
        if(low<high)
        {
            int pidx=partion(low,high,arr);

            quickSort(low,pidx-1,arr);
            quickSort(pidx+1,high,arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int high=arr.length-1;
        int low=0;
        quickSort(low,high,arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
