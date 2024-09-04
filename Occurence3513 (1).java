import java.util.*;
import java.lang.*;

public class Occurence3513 {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arrA = new int[num];
    int[] arrB = new int[num];
    int count =0;

    public static void main(String[] args){
        Occurence3513 obj = new Occurence3513();
        obj.generateNum(obj.num,obj.arrA,obj.arrB);
        System.out.println("Neelavathy-2022503513");
        System.out.println("Array A:");
        obj.display(obj.arrA);
        System.out.println("Array B:");
        obj.display(obj.arrB);
        obj.occurenceCount(obj.arrA,obj.arrB);
    }

    void generateNum(int num, int[] arr1,int[] arr2){
        Random random = new Random();
        for(int i=0; i < num ; i++){
            arr1[i] = random.nextInt(20);
            arr2[i] = random.nextInt(20);
        }
    }

    void occurenceCount(int[] arrA, int[] arrB){
         for(int i=0; i< arrA.length;i++){
             for(int j = 0 ; j < arrB.length ; j++){
                 if(arrB[i] == arrA[j])
                     count++;
             }
             System.out.println(arrB[i] + " Occurence in A is " + count );
             count =0;
         }
    }

    void display (int[] arr){
        for(int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");}
        System.out.println();
    }

}

