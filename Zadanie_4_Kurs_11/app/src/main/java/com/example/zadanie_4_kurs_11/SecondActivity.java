package com.example.zadanie_4_kurs_11;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME_KEY);
        int age = intent.getIntExtra(MainActivity.AGE_KEY, 0);
        TextView txtview = findViewById(R.id.textview);
        txtview.setText("Imię: "+name+" Wiek: "+age);

    }
}