package com.example.pildomi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    private TextView _name;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        StartLoad();
    }

    protected  void StartLoad(){
        String name = getIntent().getStringExtra("name");
        String lastname = getIntent().getStringExtra("lastname");
        String age = getIntent().getStringExtra("age");
        this._name = (TextView)findViewById(R.id._name_);
        this.age = (TextView)findViewById(R.id._age_);
        this._name.setText("Welcome "+name+" "+lastname);
        this.age.setText("Age  "+age);
    }
}