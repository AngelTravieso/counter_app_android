package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring Widgets
    TextView welcome_text, counter_text;
    Button btn, reset_btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        reset_btn = findViewById(R.id.reset_btn);
        welcome_text = findViewById(R.id.welcome_text);
        counter_text = findViewById(R.id.counter_text);

        // Adding the Functionalities

        // Increase Counter value
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set value for the textview counter
                counter_text.setText(""+increaseCounter()); // cast to String
            }
        });

        // Reset counter value
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText(""+resetCounter());
            }
        });

    }


    public int increaseCounter(){
        // preincrement variable
        return ++counter;
    }

    public int resetCounter() {
        return counter = 0;
    }
}