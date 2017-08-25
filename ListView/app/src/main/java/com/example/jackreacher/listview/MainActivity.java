package com.example.jackreacher.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView citiesBeautifulWorld;
    ArrayAdapter citiesBeautifulWorldArrayAdapter;
    String[] citiesWorld={"Islamabad","Melbourn","Sydney","Alice Springs","London","Rome","Florence","Paris","Vience","Amsterdam"
            ,"San Fransisco","Las Vegas","Istambol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesBeautifulWorld=(ListView)findViewById(R.id.cities_beautiful_world);
        citiesBeautifulWorldArrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.dummy_row_style,citiesWorld);
        citiesBeautifulWorld.setAdapter(citiesBeautifulWorldArrayAdapter);

        citiesBeautifulWorld.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Getting text out from TextView
                TextView mTitleText=(TextView)view;
                String citiesName=mTitleText.getText().toString();
                Toast.makeText(MainActivity.this, citiesName , Toast.LENGTH_SHORT).show();


            }
        });

    }
    /*Rule No 2: One method never define another method but it can use it.*/
    /*Rule no 3: in method super statement should be first statement,and return should be the last.*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basic_menu_test,menu);
        return true;
    }
}