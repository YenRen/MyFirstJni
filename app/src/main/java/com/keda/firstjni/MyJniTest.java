package com.keda.firstjni;

/**
 * Created by  zhoujun
 * on 2020/3/4
 * Desc:
 */
public class MyJniTest {

    static {
        System.loadLibrary("MyJniTest");
    }

    public native String getString();
}
