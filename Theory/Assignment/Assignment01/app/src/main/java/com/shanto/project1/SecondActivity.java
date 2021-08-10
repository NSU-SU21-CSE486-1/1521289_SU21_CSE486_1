package com.shanto.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static final String EXTRA_MESSAGE =
            "com.shanto.project1.extra.NAME";
    Object university;

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
        TextView textView2 = findViewById(R.id.text_message2);
        TextView textView3 = findViewById(R.id.text_message3);
        TextView textView4 = findViewById(R.id.text_message4);
        textView.setText(name);
        textView2.setText(date0);
        textView3.setText(NID);
        textView4.setText(blood);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.university, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        university = parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent){
        //Another interface callback
    }

    public void launchThirdActivity(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        String uni = university.toString();
        intent.putExtra(EXTRA_MESSAGE, uni);
        startActivity(intent);
    }

}
