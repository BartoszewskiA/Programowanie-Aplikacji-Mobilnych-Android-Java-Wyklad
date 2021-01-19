package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText okienkoX, okienkoY;
    TextView t1;
    int ile=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujKontrolki();
    }

    private void przygotujKontrolki() {
                okienkoX = findViewById(R.id.editText01);
                okienkoY = findViewById(R.id.editText02);
                t1 = findViewById(R.id.textView01);
    }

    public void wypiszTekst(View view) {
        //double x =0, y=0;

        //String s = okienkoX.getText().toString();
       // x = Double.parseDouble(s);
       // y = Double.parseDouble(okienkoY.getText().toString());

       // String s = getResources().getString(R.string.tekst);
       // t1.setText(s);

        String[] tablica = getResources().getStringArray(R.array.tab);
        String s="";
        for (String temp: tablica)
        {
            s=s+temp+"; ";
        }
        t1.setText(s);
    }

    public void zwieksz(View view) {
        ile++;
        okienkoX.setText(String.valueOf(ile));



    }
}

