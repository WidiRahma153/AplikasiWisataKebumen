package com.codeid.aplikasiwisatakebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton bukit, pantai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bukit = (ImageButton) findViewById(R.id.btnbukit);
        pantai = (ImageButton) findViewById(R.id.btnpantai);

    }

    public void bukit (View view) {
        Intent intent= new Intent (this, bukit.class);
        startActivity(intent);
    }
    public void pantai (View view) {
        Intent intent= new Intent (this, pantai.class);
        startActivity(intent);
    }

}