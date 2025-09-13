import java.util.Scanner;

import java.util.*;
class solution {
    public int[] BubbleSort_algo(int[] arr) {
        int i, j;
        int flag = 0;
        for (i = 0; i < arr.length-1; i++) {
            int temp;
            for (j = 0; j < arr.length -i- 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return arr;
    }
}


public class bubble_sorting {
    public static void main(String[] args) {
        solution sol=new solution();
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
        int []sorted=sol.BubbleSort_algo(a);
        System.out.println("The Sorted Array is: ");
        for(i=0;i<sorted.length;i++)
        {
            System.out.print(sorted[i]+" ");
        }

    }
}
