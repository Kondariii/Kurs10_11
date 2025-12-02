package com.example.zadanie_2_kurs_11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String ADDITION_KEY = "com.example.zadanie_2_kurs_11";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.addButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText fn_input = findViewById(R.id.pierwsza_liczba);
                EditText sn_input = findViewById(R.id.druga_liczba);
                int fn = Integer.parseInt(fn_input.getText().toString());
                int sn = Integer.parseInt(sn_input.getText().toString());
                int wynik = fn + sn;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(ADDITION_KEY, wynik);
                startActivity(intent);
            }
        });
    }
}