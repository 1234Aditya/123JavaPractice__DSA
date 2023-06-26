import java.util.Scanner;

public class sortzero {
    static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortzeroesandones(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        //Count number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int [] arr =new int[n];

        System.out.print("Enter "+n+" elements: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        sortzeroesandones(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
