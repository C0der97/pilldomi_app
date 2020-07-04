package com.example.pildomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    private EditText name;
    private EditText lastname;
    private EditText Age;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent intent = new Intent(this, Start.class);
        saveData(intent);
    }

    protected void saveData(final Intent intent){
        final Button _register = (Button) findViewById(R.id._register);
         name = (EditText) findViewById(R.id._name);
        lastname = (EditText) findViewById(R.id._name2);
        Age = (EditText) findViewById(R.id.age);
        Password = (EditText) findViewById(R.id._password);
        _register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("lastname", lastname.getText().toString());
                intent.putExtra("age", Age.getText().toString());
                intent.putExtra("password", Password.getText().toString());
                startActivity(intent);
            }
        });
    }
}