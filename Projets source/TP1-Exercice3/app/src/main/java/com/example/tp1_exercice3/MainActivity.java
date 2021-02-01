package com.example.tp1_exercice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    TextView firstname_label, lastname_label, age_label, skills_domain_label, phone_number_label;
    EditText firstname, lastname, age, skills_domain, phone_number;
    Button validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        firstname_label = new TextView(this);
        firstname_label.setText(R.string.firstname);
        firstname = new EditText(this);
        firstname.setHint(R.string.placeholder);

        lastname_label = new TextView(this);
        lastname_label.setText(R.string.lastname);
        lastname = new EditText(this);
        lastname.setHint(R.string.placeholder);

        age_label = new TextView(this);
        age_label.setText(R.string.age);
        age = new EditText(this);
        age.setHint(R.string.placeholder);

        skills_domain_label = new TextView(this);
        skills_domain_label.setText(R.string.skills_domain);
        skills_domain = new EditText(this);
        skills_domain.setHint(R.string.placeholder);

        phone_number_label = new TextView(this);
        phone_number_label.setText(R.string.phone_number);
        phone_number = new EditText(this);
        phone_number.setHint(R.string.placeholder);

        validate = new Button(this);
        validate.setText(R.string.validate);

        layout.addView(firstname_label);
        layout.addView(firstname);
        layout.addView(lastname_label);
        layout.addView(lastname);
        layout.addView(age_label);
        layout.addView(age);
        layout.addView(skills_domain_label);
        layout.addView(skills_domain);
        layout.addView(phone_number_label);
        layout.addView(phone_number);
        layout.addView(validate);

        setContentView(layout);
        // setContentView(R.layout.activity_main);
    }
}