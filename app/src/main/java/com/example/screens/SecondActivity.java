package com.example.screens;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewData = findViewById(R.id.textViewData);
        Intent intent = getIntent();
        if (intent.hasExtra("EXTRA_DATA")) {
            String data = intent.getStringExtra("EXTRA_DATA");
            textViewData.setText(data);
        }
    }
}