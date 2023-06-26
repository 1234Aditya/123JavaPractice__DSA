class hello1{
    public int search(int a) {
        int[] number = {1, 4, 7, 9, 10};
        for (int i = 0; i < number.length; i++) {
            if (a == number[i])
                return i;
        }
        return -1;
    }
}
public class searchinarr {
    public static void main(String[] args) {
        hello1 obj = new hello1();
        int ans = obj.search(100);
        System.out.println(ans);

    }
}

