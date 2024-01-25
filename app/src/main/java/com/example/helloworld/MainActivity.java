package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Button
        Button btn = findViewById(R.id.sayHelloButton);

        // Set button behavior
        btn.setOnClickListener( v -> updateText() );
    }

    private void updateText() {

        // Write log about button click action
        Log.i("HelloWorldApp", "Button Clicked!");

        // Toast to let user know the button click action
        Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();

        // Find the TextView
        TextView helloWorld = findViewById(R.id.helloWorld);

        // Print "Hello World!"
        helloWorld.setText("Hello World!");
    }
}