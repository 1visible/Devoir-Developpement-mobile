package com.example.td1_exercice4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button, button2;
    private TextView tv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.mainbutton);
        button2 = (Button) findViewById(R.id.otherbutton);
        tv = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),"Message Bouton 1", Toast.LENGTH_LONG).show();
            }
        });

        /*
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),"Message Bouton 2", Toast.LENGTH_LONG).show();
                tv.setVisibility(View.VISIBLE);
            }
        });
        */

        button2.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(),"Message Bouton 2", Toast.LENGTH_LONG).show();
                tv.setVisibility(View.VISIBLE);
                return true;
            }
        });

    }
}