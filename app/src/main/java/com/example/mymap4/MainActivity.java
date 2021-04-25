package com.example.mymap4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnWrite, btnMap;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWrite.findViewById(R.id.btnWrite);
        btnWrite.setOnClickListener(this);
        btnMap = findViewById(R.id.btnMap);
        btnMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnWrite :
                intent = new Intent(this, WriteActivity.class);
                break;

            case R.id.btnMap :
                intent = new Intent(this, MapsActivity.class);
                break;
            default: break;
        }
        startActivity(intent);
    }
}