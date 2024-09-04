import java.util.Scanner;

public class rps {
    public static void main(String[] args){
        System.out.println("Enter Rock/paper/Scissor");
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.print("Player 1:");
            String inp1 = sc.next();
            System.out.print("Player 2:");
            String inp2 = sc.next();

            if(inp1.equals(inp2))
                System.out.println("It's a tie!");
            else if (inp1.equals("Rock")){
                if(inp2.equals("Scissor"))
                    System.out.println("Player1 wins!");
                else
                    System.out.println("Player2 wins!");
            }
            else if (inp1.equals("Paper")){
                if(inp2.equals("Rock"))
                    System.out.println("Player1 wins!");
                else
                    System.out.println("Player2 Wins!");
            }
            else if(inp1.equals("Scissor")){
                if(inp2.equals("Rock"))
                    System.out.println("Player2 Wins!");
                else
                    System.out.println("Player1 wins!");
            }
            System.out.println("Do you want to Continue?(y/n)");
            char ch = sc.next().charAt(0);
            if(ch == 'y')
                flag = true;
            else
                flag = false;
        }

    }
}
