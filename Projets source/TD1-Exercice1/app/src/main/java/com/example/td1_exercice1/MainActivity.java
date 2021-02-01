package com.example.td1_exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView tv = new TextView(this);
        tv.setText("Hello, Android");

        EditText et = new EditText(this);
        et.setHint(R.string.placeholder);

        layout.addView(tv);
        layout.addView(et);

        setContentView(layout);
        */

        setContentView(R.layout.activity_main);
    }
}