package com.example.zadanie_2_kurs_11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txtView_wynik = findViewById(R.id.textView_wynik);
        Intent intent = getIntent();
        int wynik = intent.getIntExtra(MainActivity.ADDITION_KEY, 0);
        txtView_wynik.setText(String.valueOf(wynik));
    }
}