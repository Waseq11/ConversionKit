package com.example.a1913864_mohammedwaseq_android_midterm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MetrixActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edKilometers;
    Button btnConvert,btnReturn;

    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_metrix);
        initialize();
    }

    private void initialize() {
        edKilometers = findViewById(R.id.edKilometers);
        btnConvert = findViewById(R.id.btnConvert);
        btnReturn = findViewById(R.id.btnReturn);
        btnConvert.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btnConvert:
                convertToMeters();
                break;
            case R.id.btnReturn:
                returnToStartActivity();
        }

    }

    private void convertToMeters() {
        if(edKilometers.length()==0){
            Toast.makeText(MetrixActivity.this,"Empty input! Please type a number to convert",Toast.LENGTH_LONG).show();
        }

        else{
            double kilometerInput = Double.parseDouble(edKilometers.getText().toString());
            Double result = kilometerInput / 0.001;
            Toast.makeText(MetrixActivity.this,"Distance in Meters: " + result.toString() + " meters", Toast.LENGTH_LONG).show();
        }

    }

    private void returnToStartActivity() {
        Intent returnBtn = new Intent(getApplicationContext(),
        StartActivity.class);
        startActivity(returnBtn);
    }
}
