package com.shanto.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView = (TextView) findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int ff = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        if(ff == 1){
            textView.setText(R.string.text_1);
        }
        else if(ff == 2){
            textView.setText(R.string.text_2);
        }
        else if(ff == 3){
            textView.setText(R.string.text_3);
        }

    }
}