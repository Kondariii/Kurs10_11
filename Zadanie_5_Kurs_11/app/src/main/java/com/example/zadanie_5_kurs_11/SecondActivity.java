package com.example.zadanie_5_kurs_11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txtview = findViewById(R.id.textview);
        Intent intent = getIntent();
        boolean swch = intent.getBooleanExtra(MainActivity.SWITCH_KEY, false);
        if (swch == true){
            txtview.setText("Ustawienia Premium: Włączone");
        } else if (swch == false) {
            txtview.setText("Ustawienia Premium: Wyłączone");
        }
    }
}