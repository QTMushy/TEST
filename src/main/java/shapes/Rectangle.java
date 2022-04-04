package shapes;

import geometry.Shape;
import utils.Utils;

import java.util.HashSet;
import java.util.Objects;

/**
 * Rectangle Class
 */
public class Rectangle implements Shape, Comparable<Rectangle>{

    private HashSet<Integer> xCoordinates = new HashSet();
    private HashSet<Integer> yCoordinates = new HashSet();
    private final int x1, y1, x2, y2, x3, y3, x4, y4;

    /**
     * Constructor
     *
     * @param x1 x1
     * @param y1 y1
     * @param x2 x2
     * @param y2 y2
     * @param x3 x3
     * @param y3 y3
     * @param x4 x4
     * @param y4 y4
     */
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;

        xCoordinates.add(x1);
        xCoordinates.add(x2);
        xCoordinates.add(x3);
        xCoordinates.add(x4);
        yCoordinates.add(y1);
        yCoordinates.add(y2);
        yCoordinates.add(y3);
        yCoordinates.add(y4);

        Utils.checkRectangleByCoordinates(x1,y1,x2,y2,x3,y3,x4,y4);
    }



    /**
     * Copy Constructor
     *
     * @param rectangle
     */
    public Rectangle(Rectangle rectangle) {
        this.x1 = rectangle.x1;
        this.y1 = rectangle.y1;
        this.x2 = rectangle.x2;
        this.y2 = rectangle.y2;
        this.x3 = rectangle.x3;
        this.y3 = rectangle.y3;
        this.x4 = rectangle.x4;
        this.y4 = rectangle.y4;

        xCoordinates.add(this.x1);
        xCoordinates.add(this.x2);
        xCoordinates.add(this.x3);
        xCoordinates.add(this.x4);
        yCoordinates.add(this.y1);
        yCoordinates.add(this.y2);
        yCoordinates.add(this.y3);
        yCoordinates.add(this.y4);
    }

    /**
     * Get Area of a Rectangle (Utility Method)
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @return area
     */
    private float getArea(int x1, int y1, int x2,
                         int y2, int x3, int y3) {
        return (float) Math.abs((x1 * (y2 - y3) +
                x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);

    }

    /**
     * Check if a point is inside a rectangle
     * @param x
     * @param y
     * @return boolean
     */
    @Override
    public boolean checkPoint(int x, int y) {

        float A = getArea(x1, y1, x2, y2, x3, y3) +
                getArea(x1, y1, x4, y4, x3, y3);


        float A1 = getArea(x, y, x1, y1, x2, y2);


        float A2 = getArea(x, y, x2, y2, x3, y3);


        float A3 = getArea(x, y, x3, y3, x4, y4);


        float A4 = getArea(x, y, x1, y1, x4, y4);


        return (A == A1 + A2 + A3 + A4);
    }

    /**
     * Gets the Area of a Rectangle
     * @return area
     */
    public float getArea() {
        return  (float) Math.abs((x1 * (y2 - y3) +
                x2 * (y3 - y1) + x3 * (y1 - y2)));
    }

    /**
     * Get the hashCode of a Rectangle
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2, x3, y3, x4, y4);
    }


    /**
     * Check if two Rectangles are equal
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return x1 == rectangle.x1 && y1 == rectangle.y1 && x2 == rectangle.x2 && y2 == rectangle.y2
                && x3 == rectangle.x3 && y3 == rectangle.y3 && x4 == rectangle.x4 && y4 == rectangle.y4;
    }


    /**
     * Compares two Rectangles
     * @param o
     * @return 0 if equal, -1 if this is smaller, 1 if this is bigger
     */
    @Override
    public int compareTo(Rectangle o) {
      if(this.getArea() == o.getArea()) return 0;
      else if(this.getArea() < o.getArea()) return -1;
      else return 1;

    }

    /**
     * Get the Length of the side of rectangle
     * @return length
     */
    public int getLength() {
        return (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Get the Width of the side of rectangle
     * @return width
     */
    public int getWidth() {
        return (int) Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
    }
}
