package com.codeid.aplikasiwisatakebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bukit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukit);
    }
    public void dessagara(View view){
        Intent intent = new Intent(getApplicationContext(), sagara.class);
        startActivity(intent);
    }
    public void despentuluindah(View view){
        Intent intent = new Intent(getApplicationContext(), indah.class);
        startActivity(intent);
    }
    public void desbanda(View view){
        Intent intent = new Intent(getApplicationContext(), banda.class);
        startActivity(intent);
    }
    public void deslangit(View view){
        Intent intent = new Intent(getApplicationContext(), langit.class);
        startActivity(intent);
    }
    public void desjerit(View view){
        Intent intent = new Intent(getApplicationContext(), jerit.class);
        startActivity(intent);
    }
    public void fabback (View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}