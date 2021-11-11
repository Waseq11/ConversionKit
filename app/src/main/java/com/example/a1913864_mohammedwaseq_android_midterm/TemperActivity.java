package com.example.a1913864_mohammedwaseq_android_midterm;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemperActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edTemperature;
    Button btnConvert,btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temper);
        initialize();
    }

    private void initialize() {
        edTemperature = findViewById(R.id.edTemp);
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
                convertToFahrenheit();
                break;
            case R.id.btnReturn:
                returnToStartActivity();
        }

    }

    private void returnToStartActivity() {
        Intent returnBtn = new Intent(getApplicationContext(),
        StartActivity.class);
        startActivity(returnBtn);
    }

    private void convertToFahrenheit() {
        if(edTemperature.length()==0){
            Toast.makeText(TemperActivity.this,"Empty input! Please type a number to convert",Toast.LENGTH_LONG).show();
        }

        else{
            double tempInput = Double.parseDouble(edTemperature.getText().toString());
            Double result = (tempInput * 1.8) + 32;
            Toast.makeText(TemperActivity.this,"Temperature in Fahrenheit: "+  result.toString() + " °F", Toast.LENGTH_LONG).show();
        }


    }

}
