package com.example.sluchaczzdarzen2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button przycisk1, przycisk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk1 = findViewById(R.id.button01);
        przycisk2 = findViewById(R.id.button02);
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                switch(id)
                {
                    case R.id.button01: //alcja dla przycisku button1
                        break;
                    case R.id.button02: //alcja dla przycisku button2
                        break;
                }
            }
        };


        przycisk2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // tu wpisz kod
                return false;
            }
        });


        przycisk1.setOnClickListener(sluchacz);
        przycisk2.setOnClickListener(sluchacz);
    }
}