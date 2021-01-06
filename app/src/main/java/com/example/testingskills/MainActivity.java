package com.example.testingskills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SendNudes(View view){
        EditText messageView = findViewById(R.id.editTextTextPersonName2);
        String message = messageView.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}