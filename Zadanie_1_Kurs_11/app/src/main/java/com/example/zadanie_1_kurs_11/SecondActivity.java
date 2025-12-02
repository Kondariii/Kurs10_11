package com.example.zadanie_1_kurs_11;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String textsent = intent.getStringExtra("TEXT_KEY"); // Zamiast "TEXT_KEY" Można stworzyć static jako klucz (w MainActivity.java)
        TextView txtview = findViewById(R.id.txtView);
        txtview.setText(textsent);
    }
}