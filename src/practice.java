import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
class practice {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotatewithoutsp(int[] arr,int k){
        int n = arr.length;
        k= k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
//    static int[] rotate(int[] arr,int k){
//        int n = arr.length;
//        k= k%n;
//        int ans[] = new int[n];
//        int j =0;
//        for (int i =n-k ; i<n ; i++){
//            ans[j++] = arr[i];
//        }
//        for (int i =0;i<n-k;i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
//    static void swapInArray(int [] arr,int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void reverse1(int[] arr){
//        int i = 0, j = arr.length-1;
//        while (i<j){
//            swapInArray(arr,i,j);
//            i++;
//            j--;
//        }
//    }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");
            int n =  sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter "+ n +" elements: ");
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter k size for  rotation: ");
            int k = sc.nextInt();
            System.out.println("Before rotation: ");
            printarr(arr);
            System.out.println();
           rotatewithoutsp(arr,k);
            System.out.println("After rotation: ");
            printarr(arr);
    }
}