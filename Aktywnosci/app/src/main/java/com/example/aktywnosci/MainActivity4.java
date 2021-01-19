package com.example.aktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

   Button odp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        odp = findViewById(R.id.button_a04v01);
        odp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przygotujOdpowiedz();
                finish();
            }
        });
    }

    private void przygotujOdpowiedz() {
        String s = "To jest odpowiedź okna";
        Intent wynik = new Intent();
        wynik.putExtra("odpowiedz", s);
        setResult(RESULT_OK, wynik);
    }
}