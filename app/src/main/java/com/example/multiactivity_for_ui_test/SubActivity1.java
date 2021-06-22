package com.example.multiactivity_for_ui_test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout1);

        CheckBox[] checkboxes = new CheckBox[2];
        String[] str = {"no checked","checked","not checked"};
        String toastMessage = "check all checkboxes";

        Button returnButton = findViewById(R.id.subButton1);
        checkboxes[0] = findViewById(R.id.checkBox_1);
        checkboxes[0].setChecked(false);
        checkboxes[0].setText(str[0]);
        checkboxes[1] = findViewById(R.id.checkBox_2);
        checkboxes[1].setChecked(false);
        checkboxes[1].setText(str[0]);


        checkboxes[0].setOnClickListener( v -> {
            boolean flag = checkboxes[0].isChecked();
            if (flag){
                checkboxes[0].setText(str[1]);
            }else{
                checkboxes[0].setText(str[2]);
            }
        });

        checkboxes[1].setOnClickListener( v -> {
            boolean flag = checkboxes[1].isChecked();
            if (flag){
                checkboxes[1].setText(str[1]);
            }else{
                checkboxes[1].setText(str[2]);
            }
        });

        returnButton.setOnClickListener( v -> {
            if(checkboxes[0].isChecked() && checkboxes[1].isChecked()) finish();
            else{
            Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
            toast.show();
            }
        });

    }

}
