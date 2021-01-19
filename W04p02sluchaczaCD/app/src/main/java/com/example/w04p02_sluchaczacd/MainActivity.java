package com.example.w04p02_sluchaczacd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etykieta;
    Button p1,p2,p3,p4,p5;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etykieta = findViewById(R.id.textView);
        p1 = findViewById(R.id.button);
        p2= findViewById(R.id.button2);
        p3= findViewById(R.id.button3);
        p4= findViewById(R.id.button4);
        p5= findViewById(R.id.button5);


        View.OnClickListener sluchaczZdarzen = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                switch(id)
                {
                    case R.id.button: etykieta.setText("Kliknieto przycisk 1"); break;
                    case R.id.button2: etykieta.setText("Kliknieto przycisk 2"); break;
                    case R.id.button3: etykieta.setText("Kliknieto przycisk 3"); break;
                }

               // if (id==R.id.button) etykieta.setText("Kliknieto przycisk 1");
               // else if (id ==R.id.button2) etykieta.setText("Kliknieto przycisk 2");
               // else etykieta.setText("Kliknieto przycisk 3")
            }
        };

        p1.setOnClickListener(sluchaczZdarzen);
        p2.setOnClickListener(sluchaczZdarzen);
        p3.setOnClickListener(sluchaczZdarzen);

        p5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                etykieta.setText("przytrzymanie przycisku");
                return false;
            }
        });

    }
}