import java.util.*;
import java.lang.*;

public class Sort3513 {

    public static void main(String[] args) {
        int compare =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int num = sc.nextInt();
        int[] arrInt = new int[num];
        int[] arrChar = new int[num];
        char[] charArr = new char[num];
        System.out.println("Neelavathy-2022503513");
        indexPrint(num);
        charInput(num,arrChar);
        compare = sort(num, arrChar);
        numToChar(num,charArr,arrChar);
        System.out.println("Number of comparisons in Character Array:" + compare);
    }


    static void charInput(int num,int[] arrChar) {
        boolean flag;
        int randomNumber;
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            flag = random.nextBoolean();
            if (flag) {
                randomNumber = 65 + random.nextInt(26);
            } else {
                randomNumber = 97 + random.nextInt(26);
            }
            arrChar[i] = randomNumber;
        }
    }

    static void numToChar(int num, char[] chars,int[] arrchar){
        for(int i =0 ; i < num ; i++){
            chars[i] = (char) arrchar[i];
        }
        displayChar(num,chars);
    }

    static int sort(int num, int[] numArr) {
        int temp = 0;
        int compare = 0;
        for (int i = 0; i < num; i++) {
            for(int j = i+1 ; j < num ; j++){
                if (numArr[i] > numArr[j]) {
                temp = numArr[i];
                numArr[i] = numArr[j];
                numArr[j] = temp;
                compare++;
            }
            }
        }
             displayArr(num,numArr);
             return compare;
    }

    static void displayArr(int num, int[] numArr){
        System.out.print("-".repeat(20));
        System.out.println();
        for(int i =0 ; i < num; i++){
            System.out.print(numArr[i] + " | ");
        }
        System.out.println(" ");
    }

    static void displayChar(int num, char[] numArr){
        System.out.print("-".repeat(20));
        System.out.println();
        for(int i =0 ; i < num; i++){
            System.out.print(numArr[i] + " | ");
        }
        System.out.println(" ");
    }
    static void indexPrint(int num){
        System.out.print("-".repeat(20));
        System.out.println(" ");
        for(int i =0; i< num; i++){
            System.out.print( i + " | ");
        }
        System.out.println(" ");
    }
}
