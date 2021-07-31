package com.shanto.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.shanto.project1.extra.NAME";
    public static final String EXT =
            "com.shanto.project1.extra.NID";
    public static final String EXT2 =
            "com.shanto.project1.extra.DATE";
    public static final String EXT3 =
            "com.shanto.project1.extra.BLOOD";


    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;
    private EditText mName;
    private TextView mDate;
    private EditText mNID;
    private EditText mBloodGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateView = (TextView) findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);
        mName = findViewById(R.id.editText_main2);
        mDate = findViewById(R.id.textView3);
        mNID = findViewById(R.id.editText_nid);
        mBloodGroup = findViewById(R.id.editText_blood);
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };
    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String name = mName.getText().toString();
        String date = mDate.getText().toString();
        String NID = mNID.getText().toString();
        String blood = mBloodGroup.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, name);
        intent.putExtra(EXT, NID);
        intent.putExtra(EXT2, date);
        intent.putExtra(EXT3, blood);
        startActivity(intent);
    }
}