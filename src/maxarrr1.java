public class maxarrr1 {
    static int maxar(int [] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        //small work
        int smallans = maxar(arr,idx+1);
        //self work
       return(Math.max(arr[idx],smallans));
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,3,9,4};
        System.out.println(maxar(arr,0));
    }
}
