package com.wenyun.iisclient;

import android.app.Activity;
import android.os.Bundle;

import com.wenyun.iisclient.utils.Log;

/**
 * Created by zhaowenyun on 16/5/27.
 */
public class ParentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ParentActivity ----- onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ParentActivity ----- onDestroy");
    }
}
