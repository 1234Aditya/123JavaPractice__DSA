import java.util.Scanner;

public class Rangequery {
    static int[] prefixsum1(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 1; i <=n;i++) {
            arr[i] = sc.nextInt();
        }

        int [] prefix = prefixsum1(arr);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefix[r] - prefix[l-1];
            System.out.println("Sum: "+ans);
        }
    }
}
