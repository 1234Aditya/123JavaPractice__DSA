public class SelectionSort {
    static void selectionsort(int [] a){
        int n = a.length;
        for (int i =0;i<n-1;i++){//i represent current index
            int min_index = i;
            for (int j = i+1;j < n;j++){
                if (a[j] < a[min_index]){
                    min_index = j;
                }
            }
            if (min_index!= i){
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;}
        }
    }
    public static void main(String[] args) {
        int [] a ={1,5,4,3,6,9,4};
        selectionsort(a);
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}
