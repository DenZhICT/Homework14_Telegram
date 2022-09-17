package someSimpleTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EasyTest extends TestBase{

    @Test
    void test1() {
        assertTrue(true);
    }

    @Disabled
    @Test
    void test2() {
        assertTrue(true);
    }

    @Test
    void test3() {
        assertTrue(true);
    }

    @Disabled
    @Test
    void test4() {
        assertTrue(true);
    }

    @Test
    void test5() {
        assertTrue(true);
    }

    @Test
    void test6() {
        assertTrue(false);
    }

    @Test
    void test7() {
        assertTrue(true);
    }

    @Disabled
    @Test
    void test8() {
        assertTrue(true);
    }

    @Test
    void test9() {
        assertTrue(true);
    }

    @Test
    void test0() {
        assertTrue(false);
    }
}
