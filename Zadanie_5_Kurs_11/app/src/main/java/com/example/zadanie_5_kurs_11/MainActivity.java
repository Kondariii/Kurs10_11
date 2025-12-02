package com.example.zadanie_5_kurs_11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Switch;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String SWITCH_KEY = "com.example.zadanie_5_kurs_11.KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.saveBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switch swch_view = findViewById(R.id.switchYoN);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                boolean swch = swch_view.isChecked();
                intent.putExtra(SWITCH_KEY, swch);
                startActivity(intent);
            }
        });

    }
}