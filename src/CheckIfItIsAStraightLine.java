import static java.lang.Math.abs;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {

        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        int m;
        if( xDiff == 0) {
            m = 0;
        }
        else {
            m = yDiff/xDiff;
        }
        int c = coordinates[0][1] - m*coordinates[0][0];
        for(int i=2; i< coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            //System.out.println(x + " " + y);
            if( xDiff == 0 && x != 0) return false;
            else if (xDiff != 0 && y != m*x + c) return false;
        }
        return true;
    }
}
