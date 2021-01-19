package com.example.w04p01_sluchaczzdarzen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button przycisk1, przycisk2;
    TextView etykieta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujSluchaczeZdarzen();

    }

    private void przygotujSluchaczeZdarzen() {
        przycisk1 = findViewById(R.id.button);
        przycisk2 = findViewById(R.id.button2);
        etykieta1 = findViewById(R.id.textView);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etykieta1.setText("kliknięto opcję 1");
            }
        });

        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etykieta1.setText("Kliknieto opcje 2");
            }
        });
    }


}