import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class pracyice7 {
    static void reverselist (ArrayList <Integer> list){
        int n = list.size();
        int i =0;int j = n-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println(l1);
        Collections.reverse(l1);
       // reverselist(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("Ascending order: "+ l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending order: "+l1);
    }
}
