package com.example.a1913864_mohammedwaseq_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTemperature,btnMetrix,btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initialize();
    }

    private void initialize() {
        btnTemperature = findViewById(R.id.btnTemperature);
        btnMetrix = findViewById(R.id.btnMetrix);
        btnEnd = findViewById(R.id.btnEnd);
        btnTemperature.setOnClickListener(this);
        btnMetrix.setOnClickListener(this);
        btnEnd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btnTemperature:
                gotoTemperActivity();
                break;

            case R.id.btnMetrix:
                gotoMetrixActivity();
                break;

            case R.id.btnEnd:
                end();
                break;
        }
    }

    private void gotoTemperActivity() {
        Intent intent = new Intent(this,TemperActivity.class);
        startActivity(intent);
    }

    private void gotoMetrixActivity() {
        Intent intent2 = new Intent(this,MetrixActivity.class);
        startActivity(intent2);
    }

    private void end() {
        System.exit(0);
    }


}