package com.example.w05p01kontrolki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    RadioButton b1,b2,b3;
    Button sprawdz;
    SeekBar s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView01);
        b1 = findViewById(R.id.radioButton01);
        b2 = findViewById(R.id.radioButton02);
        b3 = findViewById(R.id.radioButton03);
        sprawdz = findViewById(R.id.button01);
        s1 = findViewById(R.id.seekBar01);

        sprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (b1.isChecked()) t1.setText("wybrana jest opcja 1");
//                else if(b2.isChecked()) t1.setText("wybrana jest opcja 2");
//                else if(b3.isChecked()) t1.setText("wybrana jest opcja 3");

                t1.setText(String.valueOf(s1.getProgress()));
            }
        });

        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                t1.setText(String.valueOf(i));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Zaczołeś suwanie", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Skończyłeś suwanie", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void reakcja(View view) {
        int id = view.getId();
//        switch(id) {
//            case R.id.radioButton01: t1.setText("kliknieto opcje 1"); break;
//            case R.id.radioButton02: t1.setText("kliknieto opcje 2"); break;
//            case R.id.radioButton03: t1.setText("kliknieto opcje 3"); break;
//        }
    }
}