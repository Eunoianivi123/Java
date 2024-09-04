public class PatternName {
    public static void main(String[] args){
        int i , j;
        String [][] a = {
                {"","","",""," ","N","","","","",""},
                {"","","","E","","","","E","","",""},
                {"","","E","","","","","","E",""},
                {"","L","","","","","","","","L",""},
                {"A","","","","","","","","","","A",""},
                {"","","N","E","E","L","A","","",""}
        };

        for( i =0; i< a.length; i++){
            for( j =0 ; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
