import java.util.Arrays;

class Questions3 {
    static int[] smallestandlargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
}
public class smallandlarge {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,56,76,65};
        int [] ans = Questions3.smallestandlargest(arr1);
        System.out.println("Smallest number : "+ ans[0]);
        System.out.println("Largest number : "+ ans[1]);


    }
}

