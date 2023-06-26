import java.util.ArrayList;
import java.util.function.IntFunction;

public class Arraylist extends ArrayList<Integer> {
    public static void main(String[] args) {
        //Wrapper class
//        Integer in = Integer.valueOf(4);
//        System.out.println(in);
//        Float f = Float.valueOf(4.6f);
//        System.out.println(f);
        //Creating Arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        //add an element
        l1.add(4);
        l1.add(3);
        l1.add(9);
        l1.add(12);
        //get an index at i
        //System.out.println(l1.get(0)); // 4
        //Print with the loop
        for (int i = 0;i < l1.size();i++){
            System.out.println(l1.get(i));
        }
        // Printing the arraylist directly.
        System.out.println(l1);

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        // Modify an element at index i
        l1.set(1,10);
        System.out.println(l1);

        // Removing an  element at index i
        l1.remove(1);
        System.out.println(l1);

        //Removing an element e
        l1.remove(Integer.valueOf(9));
        System.out.println(l1.remove(Integer.valueOf(9)));  //returns boolean value
        System.out.println(l1);
        System.out.println(l1.indexOf(3));

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        //If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Aditya");
        l.add(3);
        l.add(true);
        System.out.println(l);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }
}
