import java.util.Scanner;

public class practice3 {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[]  prefixsum(int[] arr){
        int n = arr.length;
        for (int i = 1;i<n;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n =  sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter "+ n +" elements: ");
        for(int i =1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int [] pref = prefixsum(arr);
        System.out.println("Enter number of Queries: ");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter limit: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.println(ans);
        }

    }
}
