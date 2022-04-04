package utils;

import org.junit.jupiter.api.*;

public class UtilsTest {
    @Nested
    @DisplayName("Tests for the static method checkRectangleByCoordinates")
    class staticCheckRectangleByCoordinatesTests {
        @Test
        void test1() {
            int value = -100;
            int value2 = -1;
            int value3 = 100;
            int value4 = -100;
            int value5 = 1;
            int value6 = 0;
            int value7 = -100;
            int value8 = 100;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
        @Test
        void test2() {
            int value = 100;
            int value2 = -100;
            int value3 = -100;
            int value4 = -1;
            int value5 = -1;
            int value6 = 0;
            int value7 = 0;
            int value8 = 1;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
        @Test
        void test3() {
            int value = -1;
            int value2 = 0;
            int value3 = 100;
            int value4 = -100;
            int value5 = 0;
            int value6 = 0;
            int value7 = 100;
            int value8 = 1;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
        @Test
        void test4() {
            int value = -1;
            int value2 = -1;
            int value3 = -100;
            int value4 = 1;
            int value5 = 0;
            int value6 = -1;
            int value7 = 1;
            int value8 = 100;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
        @Test
        void test5() {
            int value = 1;
            int value2 = 1;
            int value3 = 1;
            int value4 = 1;
            int value5 = -100;
            int value6 = -1;
            int value7 = 1;
            int value8 = 0;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
        @Test
        void test6() {
            int value = 0;
            int value2 = 0;
            int value3 = 0;
            int value4 = 0;
            int value5 = 0;
            int value6 = 0;
            int value7 = 0;
            int value8 = 0;
            Utils.checkRectangleByCoordinates(value,value2,value3,value4,value5,value6,value7,value8);
        }
    }
}
