package com.example.pildomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText user;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        this.user = (EditText) findViewById(R.id._user);
        this.password = (EditText)findViewById(R.id._password);
        String name = getIntent().getStringExtra("name");
        String password = getIntent().getStringExtra("password");
        if(this.user.getText().toString() == name && this.password.getText().toString() == password){
            Intent start = new Intent(this, Start.class);
            startActivity(start);
        }else{
            Toast.makeText(this, "User or password incorrects", Toast.LENGTH_LONG).show();
        }
    }
}