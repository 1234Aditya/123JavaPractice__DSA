public class PrintSSQ1 {
    static void printSSQ(String s,String currAns){  // s ->abc  currAns --> ""
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);  //a

        String remstring = s.substring(1);  //bc

        //Curr char --> chooses to be a part of currAns
        printSSQ(remstring,currAns+curr); //bc , a
        //Curr char --> does not choose to be a part of currAns
        printSSQ(remstring,currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc","");
    }
}
