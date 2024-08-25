import java.util.*;

public class hangman {
    public static void main(String[] args){
        int empty =0;
        String [] str = {"apple","paris","Kitchen","college","shirt"};
        Random random = new Random();
        int randomInteger = random.nextInt(str.length);
        String selected = str[randomInteger];
        String displayed = "";
        for(int  i=0 ; i< selected.length(); i++){
            if ((i%3) != 0){
                System.out.print("_");
                displayed+="_" ;}
            else{
                System.out.print(selected.charAt(i));
                displayed+=selected.charAt(i);
                empty++;}
        }

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(displayed);
        int chance =5,flag =1;
        while(chance > 0){

            System.out.print("\nGuess the Letter:");
            char ch = sc.next().charAt(0);

            if(selected.contains(String.valueOf(ch))){
                for(int  i=0 ; i < selected.length();i++){
                    if(selected.charAt(i) == ch)
                        sb.setCharAt(i,ch);
                }
                System.out.println(sb.toString());
                if(!sb.toString().contains("_")){
                    System.out.println("Congratulations, you guessed the word correctly!");
                    flag =0;break;} }
            else{
                chance--;
                System.out.println( "\n" + "Incorrect Guess! Chances Left:" + chance );
                 }
        }
        if(flag == 1)
            System.out.println("Game over! The word is " + selected);

    }
}
