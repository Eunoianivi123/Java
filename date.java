import java.util.*;

public class date {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date(dd-mm-yyyyy):");
        String date = sc.next();
        String[] str = date.split("-",3);
        int[] arr = new int[str.length];
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
            System.out.println(arr[i]);
        }
        int year = arr[2];
        int day = arr[0];
        int month = arr[1];

        int y0 = year -((14 - month)/12);
        int x = y0+y0 / 4-y0/100+y0/400;
        int m0 = month+12*((14-month)/12) -2;
        int d0 = (day + x + (31*m0)/12) % 7;

        Dictionary dict = new Hashtable();

        dict.put(0,"Sunday");
        dict.put(1,"Monday");
        dict.put(2,"Tuesday");
        dict.put(3,"Wednesday");
        dict.put(4,"Thursday");
        dict.put(5,"Friday");
        dict.put(6,"Saturday");

        System.out.println("Day:"+dict.get(d0));

    }
}
