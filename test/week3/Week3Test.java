package week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void testmax(){
        assertEquals(5,Week3.max(4,5));
        assertEquals(103,Week3.max(103,100));
        assertEquals(20,Week3.max(20,20));
        assertEquals(37,Week3.max(37,36));
        assertEquals(20,Week3.max(18,20));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testminOfArray() {
        int[] a={3,6,1,4,7,0,13,14,56};
        int[] b={34,56,54,12,57,-2};
        int[] c={1,4,2,6,7,4,5,3,9,10,23,-6,3};
        int[] d={23,53,20,38,19};
        int[] e={1,2,3};
        assertEquals(0,Week3.minOfArray(a));
        assertEquals(-2,Week3.minOfArray(b));
        assertEquals(-6,Week3.minOfArray(c));
        assertEquals(19,Week3.minOfArray(d));
        assertEquals(1,Week3.minOfArray(e));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testcaculateBMI() {
        assertEquals("Béo phì",Week3.calculateBMI(75,1.7));
        assertEquals("Thừa cân",Week3.calculateBMI(60,1.6));
        assertEquals("Bình thường",Week3.calculateBMI(62,1.8));
        assertEquals("Thiếu cân",Week3.calculateBMI(50,1.75));
        assertEquals("Bình thường",Week3.calculateBMI(52,1.65));
    }
}
