package com.hienqp.explicitintentputgetnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_SECOND_ACTIVITY = "SecondActivity";

    TextView textViewGetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewGetData = (TextView) findViewById(R.id.textView_get_data);

        Intent intent = getIntent();

        int number = intent.getIntExtra(SecondActivity.KEY_SECOND_ACTIVITY, 0);

        textViewGetData.setText(String.valueOf(number));
    }
}