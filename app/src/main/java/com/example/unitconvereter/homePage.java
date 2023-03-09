package com.example.unitconvereter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.sql.Time;

public class homePage extends AppCompatActivity {
    ImageView length;
    ImageView weight;
    ImageView temperature;
    ImageView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        length=findViewById(R.id.len);
        weight=findViewById(R.id.wt);
        temperature=findViewById(R.id.temp);
        time=findViewById(R.id.time);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homePage.this,LengthConverter.class);
                startActivity(i);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homePage.this,weightCoverter.class);
                startActivity(i);
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homePage.this,TempConverter.class);
                startActivity(i);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homePage.this, TimeConverter.class);
                startActivity(i);
            }
        });

    }
}