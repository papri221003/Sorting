import java.util.Scanner;

class solution1{
    public int[] Selection_sort_algo(int []arr)
    {
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
}
public class selection_sort {
    public static void main(String[] args) {
        solution1 sol=new solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int []sorted=sol.Selection_sort_algo(a);
        System.out.println("The Sorted Array is: ");
        for(i=0;i<sorted.length;i++)
        {
            System.out.print(sorted[i]+" ");
        }

    }
}
