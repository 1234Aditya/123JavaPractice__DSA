import java.util.Scanner;

public class existsarrr3 {
    static boolean existarr(int[] arr,int n,int target,int idx){
        if (idx >= n){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }
        return existarr(arr,n,target,idx+1);
//        if (existarr(arr,n,target,idx+1)){
//            return true;
//        }
//        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,6,3,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        if (existarr(arr,arr.length,target,0)){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
    }
}
