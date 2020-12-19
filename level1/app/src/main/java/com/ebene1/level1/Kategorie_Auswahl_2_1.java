package com.ebene1.level1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Kategorie_Auswahl_2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie__auswahl_2_1);
        Toolbar toolbar = findViewById(R.id.toolbar_main3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Nibbatimer");
    }
}