package com.example.kurs11_przykad;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcomeText = findViewById(R.id.welcomeText);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(MainActivity.EXTRA_USERNAME)) {
            String userName = intent.getStringExtra(MainActivity.EXTRA_USERNAME);
            welcomeText.setText("Witaj, " + userName + "!");
        } else {
            welcomeText.setText("Witaj, gościu!");
        }
    }
}