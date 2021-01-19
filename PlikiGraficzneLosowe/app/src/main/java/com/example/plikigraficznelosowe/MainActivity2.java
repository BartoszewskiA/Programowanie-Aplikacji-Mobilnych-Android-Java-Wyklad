package com.example.plikigraficznelosowe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView ramka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ramka2 = findViewById(R.id.ramka2);
        Bundle paczka = getIntent().getExtras();
        int nr = paczka.getInt("nr");
        switch (nr)
        {
            case 0: ramka2.setImageResource(R.drawable.p01); break;
            case 1: ramka2.setImageResource(R.drawable.p02); break;
            case 2: ramka2.setImageResource(R.drawable.p03); break;
            case 3: ramka2.setImageResource(R.drawable.p04); break;
        }
    }
}