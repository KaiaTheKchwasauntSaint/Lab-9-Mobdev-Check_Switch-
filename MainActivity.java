package com.example.prefinals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.first);
        editText2 = findViewById(R.id.second);
    }

    public void swap(View view){
        String firstW = editText1.getText().toString();
        String secondW = editText2.getText().toString();

        editText1.setText(secondW);
        editText2.setText(firstW);
    }

    public void check(View view) {
        String firstW1 = editText1.getText().toString();
        String secondW2 = editText2.getText().toString();
        String remarks = "";

        if(firstW1.equals(secondW2)) {
            remarks = "SAME";
        } else {
            remarks = "NOT THE SAME";
        }

        Intent intent = new Intent(this, Results.class);
        intent.putExtra("remarks", remarks);

        startActivity(intent);
    }
}