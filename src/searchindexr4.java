public class searchindexr4 {
    static void searchindex(int[] arr,int target,int idx){
         if(idx>=arr.length){
             return;
         }
         if(arr[idx] == target){
             System.out.print(idx);
         }
         searchindex(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,6,5,2,7,2,8};
        int target = 2;
        searchindex(arr,target,0);
    }
}
