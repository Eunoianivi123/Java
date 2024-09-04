import java.util.*;

public class ModelAndGate {
    public static void main(String[] args){
        double bias = 0.2;
        double w0 = 0.25;
        double w1 = 0.2;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x0:");
        double x0 = sc.nextDouble();
        System.out.print("Enter x1:");
        double x1 = sc.nextDouble();
        double andGate = bias + (w0*x0) + (w1*x1);
        if (andGate >= 0.5)
               System.out.println(x0 + " " + "and"+ x1 + " "+ "=" + "1");
        else
               System.out.println(x0 + " " + "and"+ x1 + " "+ "=" + "0");

    }
}
