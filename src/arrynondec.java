import java.util.Scanner;

public class arrynondec {
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
    static int[] arraysq(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int [] ans = new int[n];
        int k = 0;

        while (left <right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k] = arr[left] *arr[left];
                k++;
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
        int [] ans = arraysq(arr);
        System.out.print("Sorted array: ");
         int [] ans1 = reverse(ans);
        printArray(ans1);
    }
}
