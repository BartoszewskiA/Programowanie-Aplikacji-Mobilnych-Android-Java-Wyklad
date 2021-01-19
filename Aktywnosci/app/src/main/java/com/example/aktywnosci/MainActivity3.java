package com.example.aktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = findViewById(R.id.textView_a01v01);

        Bundle paczka = getIntent().getExtras();
        String s = paczka.getString("tekst");
        int l = paczka.getInt("liczba");
        t1.setText("Z aktywności głownej przekazano: "+s+" "+l);
    }
}