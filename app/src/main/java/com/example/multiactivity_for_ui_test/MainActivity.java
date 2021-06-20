package com.example.multiactivity_for_ui_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2activity1 = findViewById(R.id.button1);
        Button button2activity2 = findViewById(R.id.button2);
        Button button2activity3 = findViewById(R.id.button3);
        Button button2activity4 = findViewById(R.id.button4);

        button2activity1.setOnClickListener( v ->{
            Intent intent1 = new Intent(getApplication(), SubActivity1.class);
            startActivity(intent1);
        });

        button2activity2.setOnClickListener( v ->{
            Intent intent2 = new Intent(getApplication(), SubActivity2.class);
            startActivity(intent2);
        });

        button2activity3.setOnClickListener( v ->{
            Intent intent3 = new Intent(getApplication(), SubActivity3.class);
            startActivity(intent3);
        });

        button2activity4.setOnClickListener( v ->{
            Intent intent4 = new Intent(getApplication(), SubActivity4.class);
            startActivity(intent4);
        });

    }
}