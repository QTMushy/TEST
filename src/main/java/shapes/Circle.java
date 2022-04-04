package shapes;

import geometry.Shape;

/**
 * Circle Class
 */
public class Circle implements Shape {
    /**
     * radius of the circle
     */
    private double radius;

    /**
     * Constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * getter for Area
     * @return
     */
    @Override
    public float getArea() {
        return (float) (Math.PI * (float) Math.pow(radius, 2));
    }

    /**
     * Check if the point is inside the circle
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean checkPoint(int x, int y) {
         if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2)){
             return true;
         }
         return false;
    }
}
