import java.util.*;

public class sumOfArray {
    Scanner sc = new Scanner(System.in);
    int rowSize = sc.nextInt();
    int colSize = sc.nextInt();
    int i,j,sum;
    Dictionary dict = new Hashtable();

    int[][]  a = new int[rowSize][colSize];
    int[][]  b = new int[rowSize][colSize];
    int[][] sumMatrix = new int[rowSize][colSize];
    int[][] resMatrix = new int[rowSize][colSize];
    int[] sumArr = new int[colSize];

    public static void main(String[] args){
        System.out.println("Neelavathy-2022503513");
        sumOfArray s = new sumOfArray();
        System.out.println(" Matrix A:");
        s.getInput(s.a,s.rowSize,s.colSize);
        System.out.println(" Matrix B:");
        s.getInput(s.b,s.rowSize,s.colSize);
        s.addMatrix(s.a,s.b,s.rowSize,s.colSize);
        System.out.println("Sum of two Matrices:");
        s.display(s.sumMatrix, s.colSize,s.rowSize);
        s.addCol(s.sumMatrix,s.rowSize,s.colSize);
        s.colSumArr(s.sumArr,s.sumMatrix,s.rowSize,s.colSize);
        System.out.println("Sorted Matrix(based on column sum):");
        s.display(s.resMatrix, s.colSize,s.rowSize);

        System.out.println(s.dict);
    }

    void getInput(int [][] arr,int rowsize, int colsize){
        for( i=0; i < rowsize;i++){
            System.out.println("Enter the "+(i+1)+" row elements:" );
            for(j =0 ; j< colsize; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void addMatrix(int [][] a, int [][]b, int rowsize, int colsize){
        for(i=0; i<rowsize; i++){
            for(j=0; j<colsize; j++){
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void addCol(int[][] sumMatrix, int rowsize, int colsize){
             for(i =0 ; i<colsize; i++){
                 sum =0;
                 for(j =0 ; j<rowsize; j++){
                     sum+=sumMatrix[j][i];
                 }
                 sumArr[i] = sum;
                 dict.put(sum,i);
             }
    }

    void colSumArr(int[] sumArr,int[][] sumMatrix,int rowSize, int colSize){
        Arrays.sort(sumArr);
        int k=0;
        while(k < rowSize){
            i = (Integer) dict.get(sumArr[k]);
            for(j=0; j < colSize; j++){
                resMatrix[j][k] = sumMatrix[j][i];
            }
            k++;
        }
    }

    void display(int[][] res, int colSize, int rowSize ) {
        for (i = 0; i < rowSize; i++) {
            for (j = 0; j < colSize; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

}
