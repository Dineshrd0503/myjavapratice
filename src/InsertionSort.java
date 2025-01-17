import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to insertion sort");
        System.out.println("enter size of list");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element"+(i+1));
            numbers[i]=sc.nextInt();
        } 
        insertionSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    sc.close();
    }
}