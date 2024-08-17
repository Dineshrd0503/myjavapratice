import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to quick sort");
        System.out.println("enter size of list");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element"+(i+1));
            numbers[i]=sc.nextInt();
        } 
        quickSort(numbers, 0, numbers.length - 1);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}