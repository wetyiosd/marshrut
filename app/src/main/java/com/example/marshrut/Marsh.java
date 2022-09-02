package com.example.marshrut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Marsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activ_marsh);
    }

    public void onClick1(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos1.class);

        startActivity(intent);
        finish();
    }

    public void onClick2(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos2.class);

        startActivity(intent);
        finish();
    }

    public void onClick3(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos3.class);

        startActivity(intent);
        finish();
    }
    public void onClick4(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos4.class);

        startActivity(intent);
        finish();
    }

    public void onClick5(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos5.class);

        startActivity(intent);
        finish();
    }
    public void onClick6(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos6.class);

        startActivity(intent);
        finish();
    }
    public void onClick7(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos7.class);

        startActivity(intent);
        finish();
    }
    public void onClick8(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos8.class);

        startActivity(intent);
        finish();
    }
    public void onClick9(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos9.class);

        startActivity(intent);
        finish();
    }
    public void onClick10(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos10.class);

        startActivity(intent);
        finish();
    }
    public void onClick11(View view) {
        Intent intent=new Intent();
        intent.setClass(this, dos11.class);

        startActivity(intent);
        finish();
    }


}