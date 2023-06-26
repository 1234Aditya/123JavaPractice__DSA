import java.util.Scanner;

public class addmatrix {
    static void summatrix(int[][] arr,int[][]arr1,int r,int r1,int c,int c1){
        if (r != r1 || c !=c1){
            System.out.println("Wrong input - Addition not possible..");
            return;
        }
        int [][] sum1 = new int[r][c];
        for (int i =0;i<r;i++){
            for (int j = 0;j<c;j++) {
                sum1[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        printArray(sum1);
    }
    static  void printArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix 1");
        System.out.print("Enter number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = sc.nextInt();

        int [][] arr = new int[r1][c1];   //total = r*c
        System.out.print("Enter "+r1*c1+" elements: ");

        for (int i = 0;i<r1;i++){
            for (int j = 0;j<c1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2");
        System.out.print("Enter number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c2 = sc.nextInt();

        int [][] arr2 = new int[r2][c2];   //total = r*c
        System.out.print("Enter "+r2*c2+" elements: ");

        for (int i = 0;i<r2;i++){
            for (int j = 0;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        printArray(arr2);
        System.out.println("Sum of matrix-1 and matrix-2:");
        summatrix(arr,arr2,r1,r2,c1,c2);
    }
}
