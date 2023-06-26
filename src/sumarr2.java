public class sumarr2 {
    static int sumar(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = sumar(arr,idx+1);
        return arr[idx]+smallans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,9};
        System.out.println(sumar(arr,0));
    }
}
