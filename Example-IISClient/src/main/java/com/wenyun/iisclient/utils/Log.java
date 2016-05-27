package com.wenyun.iisclient.utils;

/**
 * Created by zhaowenyun on 16/5/27.
 */
public class Log {
    public static void d(String msg) {
        android.util.Log.d(Utils.TAG, msg);
    }

    public static void e(String msg) {
        android.util.Log.e(Utils.TAG, msg);
    }

}
