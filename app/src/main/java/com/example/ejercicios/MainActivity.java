package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void goToGesturesActivity(View view) {
        Intent myIntent = new Intent(this, GesturesActivity.class);
        this.startActivity(myIntent);
    }

    public void goToDireccionesActivity(View view) {
        Intent myIntent = new Intent(this, DetectorDeDireccionesActivity.class);
        this.startActivity(myIntent);
    }
}