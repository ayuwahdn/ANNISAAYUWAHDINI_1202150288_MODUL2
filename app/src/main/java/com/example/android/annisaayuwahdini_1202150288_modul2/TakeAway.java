package com.example.android.annisaayuwahdini_1202150288_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class TakeAway extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);


    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent(this, DaftarMenu.class);
        startActivity(intent);

    }

}

