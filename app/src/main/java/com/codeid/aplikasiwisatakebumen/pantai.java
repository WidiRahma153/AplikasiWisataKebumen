package com.codeid.aplikasiwisatakebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class pantai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai);
    }
    public void desmenganti (View view){
        Intent intent= new Intent(this, menganti.class);
        startActivity(intent);
    }
    public void dessurumanis (View view){
        Intent intent= new Intent(this, surumanis.class);
        startActivity(intent);
    }
    public void deswatubale (View view){
        Intent intent= new Intent(this, watubale.class);
        startActivity(intent);
    }
    public void deslampon (View view){
        Intent intent= new Intent(this, lampon.class);
        startActivity(intent);
    }
    public void despecaron (View view){
        Intent intent= new Intent(this, pecaron.class);
        startActivity(intent);
    }
    public void fabback (View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}