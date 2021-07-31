package com.shanto.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String NID = intent.getStringExtra(MainActivity.EXT);
        String date0 = intent.getStringExtra(MainActivity.EXT2);
        String blood = intent.getStringExtra(MainActivity.EXT3);
        TextView textView = findViewById(R.id.text_message);
//        TextView textView2 = findViewById(R.id.text_message2);
//        TextView textView3 = findViewById(R.id.text_message3);
//        TextView textView4 = findViewById(R.id.text_message4);
        textView.setText(name);
//        textView2.setText(date0);
//        textView3.setText(NID);
//        textView4.setText(blood);
    }

}
