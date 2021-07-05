package com.shanto.lab1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        try{
            int data = 50/0;
        }
        catch(ArithmeticException e){
            Log.e("ArithmeticException", "You can't divide any number by 0");
        }
    }
}