class Questions2{
    static int greatnum(int a,int [] arr){
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (a < arr[i])
                count++;
        }
        return count;
    }
}
public class elementsgreaterthanx {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,2,3,4,8,9,7,3,2};
        int ans = Questions2.greatnum(4,numbers);
        System.out.println("Elements greater than given element is: "+ans);

    }
}
