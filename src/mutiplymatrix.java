import java.util.Scanner;

public class mutiplymatrix {
    static  void printArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void multiply(int [][] a,int r1,int c1,int [][] b,int r2,int c2){
         if (c1 != r2){
             System.out.println("Multiplication not possible!!");
             return;
         }
         int [][] mul = new int [r1][c2];
         for (int i = 0;i<r1;i++){
             for (int j = 0;j<c2;j++){
                 for (int k = 0;k<r2;k++){
                     /*
                     i = 1,j = 0
                     mul [i][j] = ith row of a * jth col of b

                      */
                     mul [i][j] += (a[i][k] * b[k][j]);
                 }
             }
         }
        System.out.println("Multiplication of two matrices: ");
         printArray(mul);
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
        System.out.println("Matrix 2");
        System.out.print("Enter number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];   //total = r*c
        System.out.print("Enter " + r2 * c2 + " elements: ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        printArray(arr1);
        printArray(arr2);
        multiply(arr1,r1,c1,arr2,r2,c2);
    }
}
