public class printarrr8 {
    static void printr8(int[]arr,int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printr8(arr, idx + 1);
    }
    public static void main(String[] args) {
        int [] arr = {1,24,5,6,7};
        printr8(arr,0);
    }
}
