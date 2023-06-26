import java.util.ArrayList;

public class ReturnSSQ {
    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = new ArrayList<>();
        for(String ss: smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
//    static ArrayList<String> getSSQ(String s){
//        ArrayList<String> ans = new ArrayList<>();
//        //Base case
//        if (s.length() == 0){
//            ans.add("");
//            return ans;
//        }
//        char curr = s.charAt(0); //a
//        ArrayList<String> smallans = getSSQ(s.substring(1));
//        // smallans = ["bc","b","c",""]
//        //ans = ["bc","abc","b","ab","c","ac","","a"]
//        for (String ss: smallans){
//            ans.add(ss);
//            ans.add(curr + ss );
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for (String ss: ans){
            System.out.println(ss);
        }
    }
}
