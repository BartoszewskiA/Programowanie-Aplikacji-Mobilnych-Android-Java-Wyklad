package com.example.gps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LocationManager locationManager01;
    LocationListener locationListener01;
    TextView opis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.opis);
        locationManager01 = (LocationManager) getSystemService(LOCATION_SERVICE);
        locationListener01 = new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location) {
                opis.setText(String.valueOf(location.getLatitude()));
            }
        };
        GPSStart();
    }

    private void GPSStart() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager01.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener01);
        locationManager01.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,locationListener01);
    }
}