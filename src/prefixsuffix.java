import java.util.Scanner;

public class prefixsuffix {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findarrsum(int[] arr){
        int totalsum = 0;
        for (int i = 0;i<arr.length;i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartition(int [] arr){
        int totalsum = findarrsum(arr);
        int prefsum = 0;
        for (int i = 0;i<arr.length;i++){
            prefsum +=arr[i];
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum){
                return true;
            }
        }
        return false;
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
        System.out.print("Equal partition possible: "+equalsumpartition(arr));
    }
}