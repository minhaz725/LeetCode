import static java.lang.Math.abs;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {

        int path = 0;
        for(int i=0; i< points.length -1; i++) {
            //System.out.println(points[i][0] + points[i+1][0] + " " + points[i][1] + points[i+1][1]);
            int x1minusx2 = abs(points[i][0] - points[i+1][0]);
            int y1minusy2 = abs(points[i][1] - points[i+1][1]);
            System.out.println(x1minusx2+ " " + y1minusy2);
            if(x1minusx2 == y1minusy2)
                path = path + x1minusx2;
            else if(x1minusx2 > y1minusy2)
                path = path + x1minusx2;
            else path = path + y1minusy2;

        }
        return path;

    }
}
