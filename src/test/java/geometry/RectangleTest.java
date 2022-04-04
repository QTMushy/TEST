package geometry;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import shapes.Rectangle;

public class RectangleTest {
  private Rectangle rectangle;
  private Rectangle rectangle2;
  private Rectangle rectangle3;

  @DisplayName("Tests for the rectangle class")
  @BeforeEach
  public void init() {
    rectangle = new Rectangle(3,3,3,6,7,6,7,3);
    rectangle2 = new Rectangle(-3,-3,-3,-6,-7,-6,-7,-3);
  }

  @Test
  @DisplayName("Test for Copy Constructor")

  public void testCopyConstructor() {
    assert(    rectangle3 = new Rectangle(rectangle)).equals(rectangle);

  }

  @Test
  @DisplayName("Test for the getArea method")
  @Description("Tests the getArea method")
  public void testGetArea() {
    Assertions.assertEquals(12, rectangle.getArea());
    Assertions.assertEquals(12, rectangle2.getArea());
  }

  @Test
  @DisplayName("Test for the getArea method")
  @Description("Tests the getArea method")
  public void testCheckPoint() {
    Assertions.assertEquals(true,rectangle.checkPoint(3,3));
    Assertions.assertEquals(false,rectangle.checkPoint(0,0));
    Assertions.assertEquals(false,rectangle2.checkPoint(0,0));
    Assertions.assertEquals(true,rectangle2.checkPoint(-3,-3));
  }

  @Test
  @DisplayName("Test for checking if the area is equal to the area of the rectangle")
  @Description("Tests the getArea method")
  public void testArea() {
    Assertions.assertEquals(false, rectangle.equals(rectangle2));
    Assertions.assertEquals(false, rectangle2.equals(rectangle));
    Assertions.assertEquals(true, rectangle2.equals(rectangle2));
    Assertions.assertEquals(true, rectangle.equals(rectangle));
  }

  @Test
  @DisplayName("Test for checking if the rectangle is same as the other rectangle")
  public void testCompareTo() {
    Assertions.assertEquals(0, rectangle.compareTo(rectangle2));
    Assertions.assertEquals(0, rectangle2.compareTo(rectangle));
    Assertions.assertEquals(0, rectangle2.compareTo(rectangle2));
    Assertions.assertEquals(0, rectangle.compareTo(rectangle));
    Assertions.assertEquals(-1, rectangle.compareTo(new Rectangle(3,3,3,6,8,6,8,3)));
    Assertions.assertEquals(1, rectangle.compareTo(new Rectangle(3,3,3,6,6,6,6,3)));
  }

  @Test
  @Description("Tests the length of the rectangle")
  public void testLength() {
    Assertions.assertEquals(3, rectangle.getLength());
    Assertions.assertEquals(3, rectangle2.getLength());
  }

  @Test
  @Description("Tests the width of the rectangle")
  public void testWidth() {
    Assertions.assertEquals(4, rectangle.getWidth());
    Assertions.assertEquals(4, rectangle2.getWidth());
  }

}
