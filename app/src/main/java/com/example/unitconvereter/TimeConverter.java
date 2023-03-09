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

public class TimeConverter extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText enter;
    Button convert;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);
        sp1=findViewById(R.id.spinner3);
        sp2=findViewById(R.id.spinner4);
        enter=findViewById(R.id.editTextNumber1);
        convert=findViewById(R.id.button1);
        ans=findViewById(R.id.textView14);

        String[] from={"Min","Sec","Hrs"};
        ArrayAdapter ad1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"Hrs","Sec","Min"};
        ArrayAdapter ad2=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enter.getText().toString()==""){
                    Toast.makeText(TimeConverter.this, "Please enter value", Toast.LENGTH_SHORT).show();
                }
                if(sp1.getSelectedItem().toString()=="Min" && sp2.getSelectedItem().toString()=="Min"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" Min");
                }
                if(sp1.getSelectedItem().toString()=="Min"&&sp2.getSelectedItem().toString()=="Hrs"){
                    double k =Double.parseDouble(enter.getText().toString());
                    double f = (k /60);
                    ans.setText(f+" Hrs");
                }
                if(sp1.getSelectedItem().toString()=="Min"&&sp2.getSelectedItem().toString()=="Sec"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *60);
                    ans.setText(f+" Sec");
                }
                if(sp1.getSelectedItem().toString()=="Hrs"&&sp2.getSelectedItem().toString()=="Min"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *60);
                    ans.setText(f+" Min");
                }
                if(sp1.getSelectedItem().toString()=="Hrs"&&sp2.getSelectedItem().toString()=="Hrs"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" Hrs");
                }
                if(sp1.getSelectedItem().toString()=="Hrs"&&sp2.getSelectedItem().toString()=="Sec"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *3600);
                    ans.setText(f+" Sec");
                }
                if(sp1.getSelectedItem().toString()=="Sec"&&sp2.getSelectedItem().toString()=="Min"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k /60);
                    ans.setText(f+" Min");
                }
                if(sp1.getSelectedItem().toString()=="Sec"&&sp2.getSelectedItem().toString()=="Sec"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" Sec");
                }
                if(sp1.getSelectedItem().toString()=="Sec"&&sp2.getSelectedItem().toString()=="Hrs"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k /3600);
                    ans.setText(f+" Hrs");
                }
            }
        });
    }
}