import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args){
        int x = 500;                  // big integer is used to store large numbers which cannot be even stored by long.
        BigInteger ans = new BigInteger("1");

        for(int i=1 ; i <= x;i++){
            BigInteger temp = new BigInteger(i + "");
            ans = ans.multiply(temp);
        }
        System.out.println(ans);
    }
}
