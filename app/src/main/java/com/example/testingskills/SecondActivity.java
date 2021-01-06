package com.example.testingskills;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView Textarea = findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        String message = arguments.get("message").toString();

        Textarea.setText(message);

    }
}