package com.example.unitconvereter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                    finish();
                }
                finally {
                    Intent i=new Intent(MainActivity.this,homePage.class);
                    startActivity(i);

                }
            }
        };thread.start();
    }
}