package com.example.multiactivity_for_ui_test;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout2);

        Button returnButton = findViewById(R.id.subButton2);

        returnButton.setOnClickListener( v -> finish());

    }

}
