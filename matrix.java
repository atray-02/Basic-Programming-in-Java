package BasicProgram;
public class matrix {
    static void sum(int[][]a,int [][]b){
        //initialize new array c.
        int [][] c = new int [3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                //use (*) for mult, (-) for sub.
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }

    }

    static void equal(int [][] a,int [][] b) {
        int flag = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = 0;
                }
            }
        }
        if(flag == 1){
            System.out.print("Matrix are identical");
        }
        else System.out.print("Matrix are not identical.");
    }

    static void lowerTriangularMatrix(int [][] a){
        int rows = a.length;
        int columns = a[0].length;
        if(rows!=columns){
            System.out.println("Matrix should be square matrix");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    //for upper Triangular MAtrix i>j
                    if(j>i){
                        System.out.print(0 + " ");
                    }
                    else{
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void freqOfOddAndEven(int [][] a) {
        int rows = a.length;
        int columns = a[0].length;
        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }
            }
        }
        System.out.println("Even count is : " + EvenCount);
        System.out.println("Odd count is : " + OddCount);
    }

    static void rowCount(int [][]a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of row " + i + " is : " + sum);
            sum = 0;
        }
    }

    static void coloumnCount(int [][]a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }
            System.out.println("Sum of column " + i + " is : " + sum);
            sum = 0;
        }
    }

    static void transpose(int [][]a){
        int rows = a.length;
        int columns = a[0].length;
        int [][] temp = new int[columns][rows];
        System.out.println("ORignal matrices : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose of a matrices : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void isIdentityMatrix(int[][]a){
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == j && a[i][j] != 1 ){
                    flag = false;
                }
                else{
                    flag = true;
                }
            }
        }
        if (flag) System.out.println("Matrix is identity matrix");
        else System.out.println("Not identical matrix");
    }

    static void isSparseMatrix(int [][]a){
        int rows = a.length;
        int columns = a[0].length;
        int count = 0;
        int size = rows*columns;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(a[i][j] == 0){
                    count++;
                }
            }
        }
        if((size/2)<count) System.out.println("It's a sparse matrix.");
        else System.out.println("Not a sparse matrix");
    }

    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr = {{4, 0, 0},{0, 5, 0},{0, 0, 6}};
//        sum(a,b);
//        equal(a,b);
//        lowerTriangularMatrix(a);
  //      freqOfOddAndEven(a);
//        rowCount(a);
  //      coloumnCount(a);
 //       transpose(a);
//        isIdentityMatrix(a);
//        isSparseMatrix(arr);

    }
}
