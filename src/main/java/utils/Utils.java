package utils;

public class Utils {

    public static final boolean checkRectangleByCoordinates(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        if(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) == Math.sqrt(Math.pow(x3 - x4, 2)
                + Math.pow(y3 - y4, 2)) && Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)) == Math
                .sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2))) {
            return true;
        }
        throw new IllegalArgumentException("Rectangle is not valid");
    }
}
