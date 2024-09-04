import java.util.*;

public class CasinoGame {
    public static void main(String[] args){
        int credit = 1000;
        boolean flag = true;
        while(flag) {
            System.out.println("Current Credits:" + credit);
            Scanner sc = new Scanner(System.in);
            System.out.println("Ready to roll the Dice?(y/n)");
            char ch = sc.next().charAt(0);

            if (ch == 'y') System.out.println("Rolling the Dice...");
            else System.out.println("Do or Die :). Rolling the Dice...");

            int diceSum = (int) (Math.random() * 12);

            if (diceSum == 7 || diceSum == 11) {
                credit += 100;
                System.out.println("Dice Sum:"+ diceSum+"\nYou win 100 credits! New Credits:" + credit);
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                credit -= 100;
                System.out.println("Dice Sum:"+ diceSum+"\nYou lose 100 credits! New credits:" + credit);
            } else {
                System.out.println("Dice Sum:"+ diceSum+"\nOops! No changes in the credit.");
            }

            if(credit == 2000){
                System.out.println("You Won!"); flag = false;}
            if(credit == 0){
                System.out.println("You Lose!");  flag = false;}

        }








    }
}
