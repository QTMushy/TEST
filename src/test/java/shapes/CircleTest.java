package shapes;

import org.junit.jupiter.api.*;

public class CircleTest {
    @Nested
    @DisplayName("Tests for the method checkPoint")
    class checkPointTests {
        @Test
        void test1() {
            int value = -100;
            int value2 = -1;
            double value3 = 10.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test2() {
            int value = -1;
            int value2 = 0;
            double value3 = -0.5;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test3() {
            int value = -1;
            int value2 = -1;
            double value3 = 10.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test4() {
            int value = 0;
            int value2 = 100;
            double value3 = 0.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test5() {
            int value = 100;
            int value2 = 0;
            double value3 = -1.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test6() {
            int value = 0;
            int value2 = 0;
            double value3 = 0.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
        }
        @Test
        void test7() {
            int value = 100;
            int value2 = 100;
            double value3 = 10.0;
            Circle object = new Circle(value3);
            object.checkPoint(value,value2);
            object.getArea();
        }
    }
}
