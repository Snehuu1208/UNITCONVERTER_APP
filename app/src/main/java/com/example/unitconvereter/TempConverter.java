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

public class TempConverter extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText enter;
    Button convert;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
        sp1=findViewById(R.id.spinner5);
        sp2=findViewById(R.id.spinner6);
        enter=findViewById(R.id.editTextNumber2);
        convert=findViewById(R.id.button2);
        ans=findViewById(R.id.textView18);

        String[] from={"C","F","K"};
        ArrayAdapter ad1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"F","K","C"};
        ArrayAdapter ad2=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enter.getText().toString()==""){
                    Toast.makeText(TempConverter.this, "Please enter value", Toast.LENGTH_SHORT).show();
                }
                if(sp1.getSelectedItem().toString()=="C" && sp2.getSelectedItem().toString()=="C"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" C");
                }
                if(sp1.getSelectedItem().toString()=="C"&&sp2.getSelectedItem().toString()=="K"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k +273);
                    ans.setText(f+" K");
                }
                if(sp1.getSelectedItem().toString()=="C"&&sp2.getSelectedItem().toString()=="F"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k*(9/5.0))+32;
                    ans.setText(f+" F");
                }
                if(sp1.getSelectedItem().toString()=="K"&&sp2.getSelectedItem().toString()=="C"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k -273);
                    ans.setText(f+" C");
                }
                if(sp1.getSelectedItem().toString()=="K"&&sp2.getSelectedItem().toString()=="K"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" K");
                }
                if(sp1.getSelectedItem().toString()=="K"&&sp2.getSelectedItem().toString()=="F"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = ((k-273)*(9/5.0))+32;
                    ans.setText(f+" F");
                }
                if(sp1.getSelectedItem().toString()=="F"&&sp2.getSelectedItem().toString()=="C"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k-32)*(5/9.0);
                    ans.setText(f+" C");
                }
                if(sp1.getSelectedItem().toString()=="F"&&sp2.getSelectedItem().toString()=="F"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" F");
                }
                if(sp1.getSelectedItem().toString()=="F"&&sp2.getSelectedItem().toString()=="K"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k-32)*(5/9.0)+273;
                    ans.setText(f+" K");
                }
            }
        });
    }
}