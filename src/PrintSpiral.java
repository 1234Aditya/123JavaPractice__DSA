import java.util.Scanner;

public class PrintSpiral  {
    static  void printArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static  void printspiralorder(int [][] matrix,int r,int c){
        int toprow = 0,bottomrow = r-1,leftcol = 0,rightcol = c-1;
        int totalelements = 0;
        while(totalelements < r*c){
            //toprow ->left col to right col
            for (int j = leftcol;j<= rightcol &&totalelements < r*c;j++){
                System.out.print(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            //rightcol -> tooprow to bottomrow
            for (int i = toprow;i<=bottomrow && totalelements < r*c;i++){
                System.out.print(matrix[i][rightcol] + " ");
                totalelements++;
            }
            rightcol--;
            //bottomrow -> rightcol to leftcol
            for (int j = rightcol;j>=leftcol && totalelements < r*c;j--){
                System.out.print(matrix[bottomrow][j] + " ");
                totalelements++;
            }
            bottomrow--;
            //leftcol -> bottomrow to toprow
            for (int i = bottomrow;i>=toprow && totalelements < r*c;i--){
                System.out.print(matrix[i][leftcol] + " ");
                totalelements++;
            }
            leftcol++;
        }
    }
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Input matrix: ");
        printArray(arr1);

        System.out.println("Spiral order: ");
        printspiralorder(arr1,r1,c1);
    }
}
