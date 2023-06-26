import java.util.Arrays;

public class copyofarr {
        static void printArray(int [] arr1){
            for (int i = 0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
        static void  changearr(int [] arr1){
            for (int i = 0;i<arr1.length;i++){
                arr1[0] = 344;
                arr1[1] =454;
                arr1[2] = 677;
            }
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int [] arr_2 = arr.clone();
        int [] arr_2 = Arrays.copyOf(arr,arr.length); // second parameter is for length of arrays to be copied.
        System.out.println("Original array: ");
        printArray(arr);
        changearr(arr_2);
        System.out.println("Original array after changing array 2: ");
        printArray(arr);
        System.out.println("Copied arr_2 after changing array  2: ");
        printArray(arr_2 );
    }
}
