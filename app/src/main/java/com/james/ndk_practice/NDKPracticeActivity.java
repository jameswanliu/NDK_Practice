package com.james.ndk_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NDKPracticeActivity extends AppCompatActivity {


    static {
        System.loadLibrary("NDK_Practice");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk_practice);
        Toast.makeText(this, getStringFromC(), Toast.LENGTH_SHORT).show();
    }


    public static native String getStringFromC();
}
