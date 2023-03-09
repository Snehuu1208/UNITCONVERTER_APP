package com.example.unitconvereter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LengthConverter extends AppCompatActivity {
           Spinner sp1,sp2;
           EditText enter;
           Button convert;
           TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        enter=findViewById(R.id.editTextNumber);
        convert=findViewById(R.id.button);
        ans=findViewById(R.id.textView10);

        String[] from={"M","CM","KM"};
        ArrayAdapter ad1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"CM","KM","M"};
        ArrayAdapter ad2=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
              if(enter.getText().toString()==""){
                  Toast.makeText(LengthConverter.this, "Please enter value", Toast.LENGTH_SHORT).show();
              }
            if(sp1.getSelectedItem().toString()=="M" && sp2.getSelectedItem().toString()=="M"){
                double k = Double.parseDouble(enter.getText().toString());
                ans.setText(k+" M");
            }
            if(sp1.getSelectedItem().toString()=="M"&&sp2.getSelectedItem().toString()=="KM"){
                double k =Double.parseDouble(enter.getText().toString());
                double f = (k /1000);
                ans.setText(f+" KM");
            }
            if(sp1.getSelectedItem().toString()=="M"&&sp2.getSelectedItem().toString()=="CM"){
                double k =Double.parseDouble(enter.getText().toString());
                double f = (k *100);
                ans.setText(f+" CM");
            }
            if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="M"){
                double k = Double.parseDouble(enter.getText().toString());
                double f = (k *1000);
                ans.setText(f+" M");
            }
            if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="KM"){
                double k = Double.parseDouble(enter.getText().toString());
                ans.setText(k+" KM");
            }
            if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="CM"){
                double k = Double.parseDouble(enter.getText().toString());
                double f = (k *100000);
                ans.setText(f+" CM");
            }
            if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="M"){
                double k = Double.parseDouble(enter.getText().toString());
                double f = (k /100);
                ans.setText(f+" M");
            }
            if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="CM"){
                double k = Double.parseDouble(enter.getText().toString());
                ans.setText(k+" CM");
            }
            if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="KM"){
                double k = Double.parseDouble(enter.getText().toString());
                double f = (k /100000);
                ans.setText(f+" KM");
            }
        }
        });
    }
}