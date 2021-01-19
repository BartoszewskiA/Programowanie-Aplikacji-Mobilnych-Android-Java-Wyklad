package com.example.obslugagestow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektorGestow;
    TextView opis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Log debugowania","Aplikacja rozpoczyna pracę");
        opis = findViewById(R.id.opis);
        detektorGestow = new GestureDetector(this, this);
        Log.d("Log debugowania","Stworzono detektor gestów");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektorGestow.onTouchEvent(event);
        Log.d("Log debugowania","metodaonTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Log.e("Log błędu","dotknięto ekranu");
//        float X  = motionEvent.getX();
//        float Y  = motionEvent.getY();
//        float xp =motionEvent.getXPrecision();
//        float silaNacisku = motionEvent.getPressure();
//        opis.setText("onDown: "+ String.valueOf(X)+":"+String.valueOf(Y)+"\n"+String.valueOf(silaNacisku));
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
//        float X  = motionEvent.getX();
//        float Y  = motionEvent.getY();
//        opis.setText("onShowPress: \n"+ String.valueOf(X)+":"+String.valueOf(Y));

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
//        float X  = motionEvent.getX();
//        float Y  = motionEvent.getY();
//        opis.setText("onSingleTapUp: \n"+ String.valueOf(X)+":"+String.valueOf(Y));
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        float X  = motionEvent.getX();
        float Y  = motionEvent.getY();
        float X1  = motionEvent1.getX();
        float Y1  = motionEvent1.getY();
        opis.setText("onSingleTapUp: \n"+ String.valueOf(X)+" : "+String.valueOf(Y)+"\n"
                    +String.valueOf(X1)+" ; "+String.valueOf(Y1)+"\n"
                    +String.valueOf(v)+" : "+String.valueOf(v1));
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        float X  = motionEvent.getX();
        float Y  = motionEvent.getY();
        opis.setText("onLongPress: \n"
                     + String.valueOf(X)+":"+String.valueOf(Y));
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        float X  = motionEvent.getX();
        float Y  = motionEvent.getY();
        float X1  = motionEvent1.getX();
        float Y1  = motionEvent1.getY();
        opis.setText("onFling: \n"+ String.valueOf(X)+" : "+String.valueOf(Y)+"\n"
                +String.valueOf(X1)+" ; "+String.valueOf(Y1)+"\n"
                +String.valueOf(v)+" : "+String.valueOf(v1));
        return false;
    }
}