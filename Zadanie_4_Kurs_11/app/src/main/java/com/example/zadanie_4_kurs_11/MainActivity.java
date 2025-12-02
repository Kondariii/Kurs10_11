package com.example.zadanie_4_kurs_11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME_KEY = "com.example.zadanie_4_kurs_11.NAME";
    public static final String AGE_KEY = "com.example.zadanie_4_kurs_11.AGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                EditText name_input = findViewById(R.id.name_input);
                String name_value = name_input.getText().toString();
                EditText age_input = findViewById(R.id.Age_input);
                String string_age = age_input.getText().toString();
                int age = Integer.parseInt(string_age);
                intent.putExtra(NAME_KEY, name_value);
                intent.putExtra(AGE_KEY, age);
                startActivity(intent);
            }
        });
    }
}