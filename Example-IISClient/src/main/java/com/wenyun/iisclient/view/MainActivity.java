package com.wenyun.iisclient.view;

import android.os.Bundle;

import com.wenyun.iisclient.ParentActivity;
import com.wenyun.iisclient.R;
import com.wenyun.iisclient.utils.Log;

/**
 * Created by zhaowenyun on 16/5/27.
 */
public class MainActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity ----- onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity ----- onDestroy");
    }
}
