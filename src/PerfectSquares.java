public class PerfectSquares {
    int numSquares(int n) {

        if(checkIfPerfectSquare(n)) return 1;
        if(checkIfLegendres(n)) return 4;
        if(checkIfSumOfTwoSquares(n)) return 2;
        return 3;
    }

    boolean checkIfPerfectSquare(int n) {
        double sqrtNumber = Math.sqrt(n);
        int floor = (int)Math.floor(sqrtNumber);
        int ceiling = (int)Math.ceil(sqrtNumber);
        //System.out.println(floor + " "+ ceiling);
        return (floor == ceiling);
    }

    boolean checkIfLegendres(int n) {
        // should follow 4^a(8b + 7) pattern
        while( n % 4 == 0)
            n = n/4;
        //System.out.println(n);
        return n % 8 == 7;
    }

    boolean checkIfSumOfTwoSquares(int n) {
        int floor = (int)Math.floor(n);
        for(int i = 1; i<=floor; i++)
        {
            for(int j = 1; j<=floor; j++)
            {
                if(i*i + j*j == n){
                    return true;

                }
            }
        }
        return false;
    }
}


