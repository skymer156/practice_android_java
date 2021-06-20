package com.example.multiactivity_for_ui_test;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout4);

        Button returnButton = findViewById(R.id.subButton4);

        returnButton.setOnClickListener( v -> finish());

    }

}
