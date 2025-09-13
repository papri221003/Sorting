public class MergeSort {
    public static void conquer(int arr[],int strt,int mid,int end)
    {
        int merged[]=new int[(end-strt)+1];

        int idx1=strt;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else {
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid)
        {
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=end)
        {
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }

        for(int i=0;i< merged.length;i++)
        {
            arr[strt+i]=merged[i];
        }
    }
    public static void divide(int arr[],int strt,int end)
    {
        if(strt>=end)
        {
            return;
        }
        int mid=strt+(end-strt)/2;
        divide(arr,strt,mid);
        divide(arr,mid+1,end);
        conquer(arr,strt,mid,end);
    }
    public static void main(String[] args) {
        int arr[]={6,3,5,2,1,8,9};
        int strt=0;
        int end=arr.length-1;

        divide(arr,strt,end);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
