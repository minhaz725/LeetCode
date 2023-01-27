import static java.lang.Math.abs;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {

        double x0 = coordinates[0][0];
        double x1 = coordinates[1][0];
        double y0 = coordinates[0][1];
        double y1 = coordinates[1][1];
        double xDiff = x1 - x0;
        double yDiff = y1 - y0;
        double m;
        if( xDiff == 0) {
            m = 0;
        }
        else {
            m = yDiff/xDiff;
        }
        double c = coordinates[0][1] - m*coordinates[0][0];
        for(int i=2; i< coordinates.length; i++) {
            double x = coordinates[i][0];
            double y = coordinates[i][1];
            System.out.println(x + " " + y);
            if( xDiff == 0 && x-x0 != 0) return false;
            else if (xDiff != 0 && y != m*x + c) return false;
        }
        return true;
    }
}
