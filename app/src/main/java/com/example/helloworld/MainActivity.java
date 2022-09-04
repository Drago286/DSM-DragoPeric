package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.e("MainActivity", "Happy Birthday");
       Log.d("MainActivity", "Happy Birthday");
       Log.i("MainActivity", "Happy Birthday");
       Log.v("MainActivity", "Happy Birthday");
       Log.w("MainActivity", "Happy Birthday");


    }
}