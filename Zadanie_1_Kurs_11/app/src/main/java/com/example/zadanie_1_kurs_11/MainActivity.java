package com.example.zadanie_1_kurs_11;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    // Tutaj moglibyśmy zrobić static jako klucz
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.sendButton);
        String wyslanytext = "Dane zostały pomyślnie przesłane";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("TEXT_KEY", wyslanytext); // Tutaj podalibyśmy lokalizacje i nazwę klucza w przypadku static (MainActivity.TEXT_KEY)
                startActivity(intent);
            }
        });
    }
}