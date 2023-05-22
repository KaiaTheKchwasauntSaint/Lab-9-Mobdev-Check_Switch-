package com.example.prefinals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        result = findViewById(R.id.result);

        String remarks = getIntent().getExtras().getString("remarks");

        result.setText(remarks);
    }
}