import java.util.Scanner;

public class pairsum {
    static int pairsum(int[] arr, int target) {
        int ans =0;
        for (int i = 0;i<arr.length;i++){   //First number
            for (int j = i+1 ;j<arr.length;j++){   //Second number
                if (arr[i] + arr[j]== target){
                    ans++;
                }
            }
        }
        return ans;
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
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        int answer = pairsum(arr,target);
        System.out.println("Total number of pairs: "+answer);
    }
}

