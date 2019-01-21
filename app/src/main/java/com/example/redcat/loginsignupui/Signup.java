package com.example.redcat.loginsignupui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.getSupportActionBar().setTitle("Sign Up");

    }
    public void stol(View view) {
        Intent intent = new Intent(Signup.this , MainActivity.class);
        startActivity(intent);
    }
}
