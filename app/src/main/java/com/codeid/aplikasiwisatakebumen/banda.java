package com.codeid.aplikasiwisatakebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class banda extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banda);
        SupportMapFragment mapFragment = SupportMapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.maps, mapFragment)
                .commit();
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoom = 16.0f;
        LatLng lokasi = new LatLng(-7.559813221280272, 109.71741866580136);
        googleMap.addMarker(new MarkerOptions()
                .position(lokasi)
                .title("Bukit Banda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi,zoom));
    }
    public void fabback (View view){
        Intent intent= new Intent(this, bukit.class);
        startActivity(intent);
    }
}