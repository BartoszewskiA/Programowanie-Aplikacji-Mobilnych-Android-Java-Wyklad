package com.example.wykladlistmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View wybrany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] tresc = getResources().getStringArray(R.array.trescListy);
        ListView widokListy = findViewById(R.id.list01);
        Button przycisk = findViewById(R.id.button01);
        Button przycisk2 = findViewById(R.id.button02);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tresc);
        widokListy.setAdapter(adapter);

        widokListy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Kliknięto: "+i, Toast.LENGTH_SHORT).show();
            }
        });

        registerForContextMenu(przycisk);
        registerForContextMenu(przycisk2);

        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main_2);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_kontekstowe,menu);
        wybrany = v;
    super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.poz01: Toast.makeText(MainActivity.this, "Kliknięto: 1", Toast.LENGTH_SHORT).show(); break;
            case R.id.poz02: Toast.makeText(MainActivity.this, "Kliknięto: 2", Toast.LENGTH_SHORT).show(); break;
            case R.id.poz03: Toast.makeText(MainActivity.this, "Kliknięto: 3", Toast.LENGTH_SHORT).show(); break;
            case R.id.poz04: Toast.makeText(MainActivity.this, "Kliknięto: 4", Toast.LENGTH_SHORT).show(); break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kon01)  {
            Toast.makeText(MainActivity.this, "Kliknięto: 1" +String.valueOf(wybrany.getId()), Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}