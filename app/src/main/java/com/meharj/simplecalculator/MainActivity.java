package com.meharj.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       EditText e1;
       EditText e2;
       Button add;
       int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        add = (Button)findViewById(R.id.button);
        add.setOnClickListener(new AddButtonClickHandler());
    }
    public class AddButtonClickHandler implements OnClickListener {
        public void onClick(View view) {
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            Intent explicitIntent = new Intent(MainActivity.this,
                    SecondActivity.class);
            explicitIntent.putExtra("SUM", num1 + "+" + num2 + "=" + (num1 + num2));
            startActivity(explicitIntent);
        }
    }
}
