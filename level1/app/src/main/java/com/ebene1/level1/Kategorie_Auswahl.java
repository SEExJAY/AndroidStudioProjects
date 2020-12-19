package com.ebene1.level1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kategorie_Auswahl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie__auswahl);
        Toolbar toolbar = findViewById(R.id.toolbar_main2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kategorien");
    }

    public void kategorie_genommen_2_1 (View view){
        Intent intent = new Intent(this, Kategorie_Auswahl_2_1.class);
        startActivity(intent);
    }
}