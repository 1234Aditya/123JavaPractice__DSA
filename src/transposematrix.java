import java.util.Scanner;

public class transposematrix {
    static void transpose(int[][] arr,int r,int c){
        int [][] trans = new int[c][r];
        for (int i = 0;i < c;i++){
            for (int j = 0;j < r;j++){
               trans [i][j] = arr [j][i];
            }
        }
        printArray(trans);
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

        int[][] arr1 = new int[r1][c1];   //total = r*c
        System.out.print("Enter " + r1 * c1 + " elements: ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        printArray(arr1);
        System.out.println("Transpose of matrix: ");
        transpose(arr1,r1,c1);
    }
}
