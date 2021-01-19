package com.example.w03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView label;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = findViewById(R.id.textView01);
        random = new Random();
    }

    public void akcja(View view) {
        //String s = getResources().getString(R.string.inne_powitanie);
        //label.setText(s);
        int n = random.nextInt(5);
        String[] tablicaPowitan = getResources().getStringArray(R.array.powitania);
        label.setText(tablicaPowitan[n]);
    }
}