package com.shanto.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.shanto.twoactivities.extra.MESSAGE";
    public static int button1;
    public static int button2 = 2;
    public static int button3;

    static {
        button1 = 1;
        button3 = 3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, button1);
        startActivity(intent);
    }
    public void launchSecondActivity2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, button2);
        startActivity(intent);
    }
    public void launchSecondActivity3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, button3);
        startActivity(intent);
    }
}