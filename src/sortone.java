import java.util.Scanner;

public class sortone {
    static int[] reverse(int[] arr){
        int [] ans = new int[arr.length];
        int j =0;
        for (int i = arr.length-1;i>=0;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap (int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortzeroneandone(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right) {
                if (arr[left] == 0 && arr[right] == 1) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if (arr[left] == 1) {
                    left++;
                }
                if (arr[right] == 0) {
                    right--;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        sortzeroneandone(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
