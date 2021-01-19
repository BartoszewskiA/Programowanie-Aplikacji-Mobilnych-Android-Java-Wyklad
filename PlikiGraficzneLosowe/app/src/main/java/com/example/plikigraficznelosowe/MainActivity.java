package com.example.plikigraficznelosowe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random;
    ImageView ramka;
    RadioButton r1,r2,r3,r4;
    View.OnClickListener sluchacz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ramka = findViewById(R.id.ramka);
        r1 = findViewById(R.id.radioButton01);
        r2 = findViewById(R.id.radioButton02);
        r3 = findViewById(R.id.radioButton03);
        r4 = findViewById(R.id.radioButton04);
        random = new Random();
        sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                switch (id)
                {
                    case R.id.radioButton01: ramka.setImageResource(R.drawable.p01); break;
                    case R.id.radioButton02: ramka.setImageResource(R.drawable.p02); break;
                    case R.id.radioButton03: ramka.setImageResource(R.drawable.p03); break;
                    case R.id.radioButton04: ramka.setImageResource(R.drawable.p04); break;

                }
            }
        };
        ramka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencja = new Intent(MainActivity.super.getApplicationContext(), MainActivity2.class);
                if (r1.isChecked()) intencja.putExtra("nr", 0);
                else if (r2.isChecked()) intencja.putExtra("rn",1);
                else if (r3.isChecked()) intencja.putExtra("nr",2);
                else intencja.putExtra("nr",3);
                startActivity(intencja);
            }
        });
        r1.setOnClickListener(sluchacz);
        r2.setOnClickListener(sluchacz);
        r3.setOnClickListener(sluchacz);
        r4.setOnClickListener(sluchacz);
        losuj();

    }

    private void losuj() {
        int los = random.nextInt(5);
        switch (los)
        {
            case 0:
                ramka.setImageResource(R.drawable.p01);
                r1.setChecked(true);
                break;
            case 1:
                ramka.setImageResource(R.drawable.p02);
                r2.setChecked(true);
                break;
            case 2:
                ramka.setImageResource(R.drawable.p03);
                r3.setChecked(true);
                break;
            case 3:
                ramka.setImageResource(R.drawable.p04);
                r4.setChecked(true);
                break;

        }

    }
}