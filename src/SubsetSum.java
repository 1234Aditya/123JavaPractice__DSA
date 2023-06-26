public class SubsetSum {
    static  void subsetsum(int[] a,int n,int idx,int sum){
        if (idx>=n){
            System.out.println(sum);
            return;
        }

        //curridx +sum
        subsetsum(a,n,idx+1,sum+a[idx]);  //include
        //currans
        subsetsum(a,n,idx+1,sum);//exclude
    }
    public static void main(String[] args) {
        int [] a = {2,4,5};
        subsetsum(a,a.length,0,0);
    }
}
