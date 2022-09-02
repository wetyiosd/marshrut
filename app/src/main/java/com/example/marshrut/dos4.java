package com.example.marshrut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class dos4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.dos4);
    }

    public void onClick(View view) {
        Intent intent=new Intent();
        intent.setClass(this, Marsh.class);

        startActivity(intent);
        finish();
    }

}