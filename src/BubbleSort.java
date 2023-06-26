public class BubbleSort {
    static void bubblesort(int[] a){
        int n = a.length;
        //n-1 iterations passes
        for (int i =0;i < n-1;i++){
            boolean flag = false;  // has any swaps happened
            for (int j = 0;j < n-i-1;j++){   //last i elements are already in sorted condition.
                if (a[j] > a[j+1]){
                    //swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;  //some swap has happened
                }
            }
            if (!flag){ //has any swaps happened
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {7,6,4,2,8};
        bubblesort(a);
        for (int aa : a){
            System.out.print(aa+ " ");
        }
    }
}
