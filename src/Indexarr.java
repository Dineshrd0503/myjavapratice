import java.util.*;
public class Indexarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element"+i);
            arr[i]=scanner.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int num = scanner.nextInt();
        boolean found = findNumber(arr, num);
        int index=findIndex(arr, num);
        if (found) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
        System.out.println("The index of " + num + " is " + index);
        scanner.close();
    }
    public static boolean findNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    public static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; // return -1 if the number is not found in the array
    }
}