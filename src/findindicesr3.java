import java.util.ArrayList;

public class findindicesr3 {
    static ArrayList<Integer> allindices(int[] a,int n,int target,int idx){
        if (idx>=n){
            return new ArrayList<Integer>();  //return empty arraylist
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        //self work
        if(a[idx]==target){
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallans = allindices(a,n,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,3,2,4,3,2,1};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = allindices(a,n,target,0);
        for (Integer i : ans){
            System.out.println(i);
        }
    }
}
