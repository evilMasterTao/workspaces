package com.taodada.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    private static final String TAG = "HelloWorldActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Log.d("HelloWorldActivity", "onCreate execute");
        Log.d(TAG, "onCreate: ");
    }
}
