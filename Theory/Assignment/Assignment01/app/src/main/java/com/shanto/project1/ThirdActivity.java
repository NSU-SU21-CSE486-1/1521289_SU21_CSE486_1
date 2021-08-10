package com.shanto.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        String uni = intent.getStringExtra(SecondActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message5);
        textView.setText(uni);
    }
}