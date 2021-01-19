package com.example.widoklisttest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView l1 = findViewById(R.id.lista);

        String[] tab = getResources().getStringArray(R.array.Lista);

        final ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tab);
        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "kliknięto: "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       int id = item.getItemId();
        switch (id)
                {
                    case R.id.poz1: Toast.makeText(MainActivity.this, "kliknięto 1:", Toast.LENGTH_SHORT).show(); break;
                    case R.id.poz2: Toast.makeText(MainActivity.this, "kliknięto 2:", Toast.LENGTH_SHORT).show(); break;
                    case R.id.poz3: Toast.makeText(MainActivity.this, "kliknięto 3:", Toast.LENGTH_SHORT).show(); break;
                }
        return super.onOptionsItemSelected(item);
    }
}