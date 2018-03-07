package com.meharj.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView result;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String sum = (String) intent.getSerializableExtra("SUM");
        result.setText(sum);
    }
}
