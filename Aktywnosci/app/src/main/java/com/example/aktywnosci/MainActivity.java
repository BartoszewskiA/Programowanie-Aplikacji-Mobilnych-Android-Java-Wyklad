package com.example.aktywnosci;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2, b3, b4, b5;
    TextView t;

    static final int KOD_ODPOWIEDZI = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        t = findViewById(R.id.opis);
        utworzSluchacze();
    }

    private void utworzSluchacze() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otworzAktywnosc();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otworzAktywnosc2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otworzAktywnosc3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otworzPrzegladarke();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otworzMape();
            }
        });
    }

    private void otworzMape() {
        Uri polorzenie = Uri.parse("geo:51.405,21.1756");
        Intent intencja = new Intent(Intent.ACTION_VIEW, polorzenie);
        startActivity(intencja);
    }

    private void otworzPrzegladarke() {

        Uri adres = Uri.parse("http://www.bartoszewski.uniwersytetradom.pl/");
        Intent intencja = new Intent(Intent.ACTION_VIEW, adres);
        startActivity(intencja);
    }


    private void otworzAktywnosc3() {
        Intent intencja = new Intent(this, MainActivity4.class);

        startActivityForResult(intencja,KOD_ODPOWIEDZI);
    }

    private void otworzAktywnosc2() {
        Intent intencja = new Intent(this, MainActivity3.class);
        intencja.putExtra("tekst", "To jest tekst przesłany z aktywności 1");
        intencja.putExtra("liczba", 101);
        startActivity(intencja);
    }

    private void otworzAktywnosc() {
        Intent intencja = new Intent(this, MainActivity2.class);
        startActivity(intencja);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==KOD_ODPOWIEDZI)
        {
            String s = data.getStringExtra("odpowiedz");
            t.setText(s);
        }
    }
}