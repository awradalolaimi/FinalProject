package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent two = new Intent(page2.this,suggestions1.class);

        Button link1 = findViewById(R.id.BTN2);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(two);



            }
        });
        Intent three = new Intent(page2.this,myMoodIs.class);

        Button link2 = findViewById(R.id.BTN3);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(three);
            }
        });
    }
}