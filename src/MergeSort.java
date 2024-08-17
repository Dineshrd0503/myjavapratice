import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to merge sort");
        System.out.println("enter size of list");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element"+(i+1));
            numbers[i]=sc.nextInt();
        } 
        mergeSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}