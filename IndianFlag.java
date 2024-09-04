public class IndianFlag {
    public static void main(String[] args){
        line(21);
        sideLine(2);
        line(21);
        star(3);
        line(21);
        sideLine(2);
        line(21);
        tail(8);

    }
    static void line(int num){
            System.out.print("-".repeat(num));
            System.out.println();
    }
    static void sideLine(int num){
        for(int i =0 ; i<num; i++){
            System.out.print("|");
            System.out.print(" ".repeat(19));
            System.out.print("|");
            System.out.println();
        }

    }
    static void star(int num){
        for(int i =0; i < num ; i++) {
            System.out.print("|");
            System.out.print(" ".repeat(6));
            System.out.print("*".repeat(7));
            System.out.print(" ".repeat(6));
            System.out.print("|");
            System.out.println();
        }
    }
    static void tail(int num){
        for(int  i=0; i<num;i++)
            System.out.println("|");
    }

}
