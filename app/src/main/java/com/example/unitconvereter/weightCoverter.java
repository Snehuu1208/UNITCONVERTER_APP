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

public class weightCoverter extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText enter;
    Button convert;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_coverter);
        sp1=findViewById(R.id.spinner7);
        sp2=findViewById(R.id.spinner8);
        enter=findViewById(R.id.editTextNumber3);
        convert=findViewById(R.id.button3);
        ans=findViewById(R.id.textView22);

        String[] from={"G","MG","KG"};
        ArrayAdapter ad1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"MG","KG","G"};
        ArrayAdapter ad2=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enter.getText().toString()==""){
                    Toast.makeText(weightCoverter.this, "Please enter value", Toast.LENGTH_SHORT).show();
                }
                if(sp1.getSelectedItem().toString()=="G" && sp2.getSelectedItem().toString()=="G"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" G");
                }
                if(sp1.getSelectedItem().toString()=="G"&&sp2.getSelectedItem().toString()=="KG"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k /1000);
                    ans.setText(f+" KG");
                }
                if(sp1.getSelectedItem().toString()=="G"&&sp2.getSelectedItem().toString()=="MG"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *1000);
                    ans.setText(f+" MG");
                }
                if(sp1.getSelectedItem().toString()=="KG"&&sp2.getSelectedItem().toString()=="G"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *1000);
                    ans.setText(f+" G");
                }
                if(sp1.getSelectedItem().toString()=="KG"&&sp2.getSelectedItem().toString()=="KG"){
                    double k = Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" KG");
                }
                if(sp1.getSelectedItem().toString()=="KG"&&sp2.getSelectedItem().toString()=="MG"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k *1000000);
                    ans.setText(f+" MG");
                }
                if(sp1.getSelectedItem().toString()=="MG"&&sp2.getSelectedItem().toString()=="G"){
                    double k =Double.parseDouble(enter.getText().toString());
                    double f = (k /1000);
                    ans.setText(f+" G");
                }
                if(sp1.getSelectedItem().toString()=="MG"&&sp2.getSelectedItem().toString()=="MG"){
                    double k= Double.parseDouble(enter.getText().toString());
                    ans.setText(k+" MG");
                }
                if(sp1.getSelectedItem().toString()=="MG"&&sp2.getSelectedItem().toString()=="KG"){
                    double k = Double.parseDouble(enter.getText().toString());
                    double f = (k /1000000);
                    ans.setText(f+" M");
                }
            }
        });
    }
}