package com.example.android.annisaayuwahdini_1202150288_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton dinein = (RadioButton) findViewById(R.id.dine_in);
        RadioButton takeaway = (RadioButton) findViewById(R.id.takeaway);

        if(dinein.isChecked()){
            Intent d = new Intent(this, DineInActivity.class);
            Toast.makeText(MainActivity.this, "Dine In", Toast.LENGTH_LONG).show();
            startActivity(d);
        }
        else if(takeaway.isChecked()) {
            Intent t = new Intent(this, TakeAway.class);
            Toast.makeText(MainActivity.this, "Take Away", Toast.LENGTH_LONG).show();
            startActivity(t);
        }
        else{
            Toast nothing = Toast.makeText(this, "Select one of them", Toast.LENGTH_LONG);
            nothing.show();
        }

    }
    }


