import java.util.Scanner;

public class querynumber {
    static int[] makefrequencyarray(int[] arr){
        int [] freq = new int[100005];

        for (int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
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

        int [] freq = makefrequencyarray(arr);
         System.out.println("Enter number of Queries: ");
         int q = sc.nextInt();

         while (q>0){
             System.out.println("Enter number to be searched for: ");
             int x = sc.nextInt();
             if (freq[x] > 0) {
                 System.out.println("Yes");
             }else{
                 System.out.println("No");
             }
             q--;
         }
    }
}
