import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to bubble sort");
        System.out.println("enter size of list");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element"+i+1);
            numbers[i]=sc.nextInt();
        } 
        bubbleSort(numbers);
        System.out.println("sorted list is");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}