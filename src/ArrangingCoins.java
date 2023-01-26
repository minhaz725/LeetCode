import java.math.BigInteger;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        BigInteger sum = BigInteger.ZERO;
        int row = 0;
        for(BigInteger i= BigInteger.ONE; i.compareTo(BigInteger.valueOf(n))  <= 0; i = i.add(BigInteger.ONE)){
            sum = sum.add(i);
            //System.out.println(sum + " " + n);
            if(sum.compareTo(BigInteger.valueOf(n)) ==0) {
                row = i.intValue();
                break;
            }
            if(sum.compareTo(BigInteger.valueOf(n)) > 0) {
                row = i.intValue() -1;
                break;
            }
        }
        return row;
    }
}
