import java.util.Scanner;

public class secondlargest {
    static  int findmax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondmax(int [] arr){
        int mx = findmax(arr);

        for (int i = 0;i<arr.length;i++){
            if (arr[i] == mx){
                arr[i] =Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        if (secondmax==Integer.MIN_VALUE){
            return -1;
        }
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    }
        System.out.println("Second maximum: "+findSecondmax(arr));
}}

