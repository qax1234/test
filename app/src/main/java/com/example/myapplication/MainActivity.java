package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button StartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartButton = findViewById(R.id.button);

    }
    public void Start(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
}