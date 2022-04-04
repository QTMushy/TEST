package geometry;

/**
 * A shape is a geometric object that can be described by a set of points.
 *
 */
public interface Shape {

    /**
     * Returns the area of the shape.
     * @return
     */
    float getArea();

    /**
     * Check if the point lies in the plane.
     * @param x
     * @param y
     * @return
     */
    boolean checkPoint(int x, int y);

}
