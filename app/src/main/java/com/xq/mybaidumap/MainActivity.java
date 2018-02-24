package com.xq.mybaidumap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BaiduMapLocationUtils baiduMapLocationUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baiduMapLocationUtils = BaiduMapLocationUtils.getInstance(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        baiduMapLocationUtils.onStop();
    }

}
