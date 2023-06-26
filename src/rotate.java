import java.util.Scanner;

public class rotate {
    static int[] rotatearr(int[] arr, int k) {
       int n = arr.length;
       k = k % n;
       int [] ans = new int[n];
       int j = 0;
       for(int i = n-k;i<n;i++){
           ans[j++] = arr[i];
       }
       for (int i = 0;i<n-k;i++){
           ans[j++] = arr[i];
       }
       return ans;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        System.out.print("Original array: ");
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        int [] ans = rotatearr(arr1,4);
        System.out.print("Array after rotation: ");
        for (int i = 0;i<ans.length;i++){
            System.out.print (ans[i]+" ");
        }
    }
}
