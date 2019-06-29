package cn.itcast;

import org.junit.Test;

/**
 * Author: 骑猪撞地球QAQ
 * Date: 2019/6/29 8:14
 * Content:
 */
public class DemoTest {
    static {
        int i = 10;
    }
    int x, i;
    @Test
    public void test01() {
        for (int j = 0; j < 5; j++) {
            x++;
            i++;
        }
        System.out.println(x++ + i++);
    }

    @Test
    public void test02() {
        int j = 0;
        for (int k = 0; k < 100; k++) {
            j++;
        }
        System.out.println(j);
    }
}
