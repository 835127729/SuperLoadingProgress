package com.example.kaiyicky.myapplication;

import android.test.InstrumentationTestCase;

/**
 * Created by kaiyi.cky on 2015/8/17.
 */
public class ExmapleTest extends InstrumentationTestCase{
    public void test() throws Exception{
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
