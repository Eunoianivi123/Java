import java.util.*;

public class numWords {
    public static void main(String[] args){
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number(0 to 999):");
        int num = sc.nextInt();

        String [] ones = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
        String [] twos = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String [] hundreds = {"one hundred and","two hundred and","three hundred and","four hundred and","five hundred and","six hundred and","seven hundred and","eight hundred","nine hundred and"};

        int [] arr = {0,0,0};

        while( num > 0){
            arr[i] = num%10;
            num= num/10;
            i++;
        }
        int j =2;
        if(arr[j] !=0 )
            System.out.print(hundreds[arr[j]-1] + " ");
        j--;
        if(arr[j] != 0)
            System.out.print(twos[arr[j]-1] + " ");
        j--;
        System.out.print(ones[arr[j]]);



    }
}
