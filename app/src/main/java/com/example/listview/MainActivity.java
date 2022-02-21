package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    ArrayList<String> arrNames = new ArrayList<>(  );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        arrNames.add("Abhishek");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramujan");
        arrNames.add("Ajay");
        arrNames.add("Arijit");
        arrNames.add("Abhijit");
        arrNames.add("Ramesh");
        arrNames.add("Yash");
        arrNames.add("Akash");
        arrNames.add("Abhishek");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramujan");
        arrNames.add("Ajay");
        arrNames.add("Arijit");
        arrNames.add("Abhijit");
        arrNames.add("Ramesh");
        arrNames.add("Yash");
        arrNames.add("Akash");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(MainActivity.this, "clicked on first item", Toast.LENGTH_SHORT).show( );
                } else if (position==1){
                    Toast.makeText(MainActivity.this, "clicked on second item", Toast.LENGTH_SHORT).show( );
                } else {
                    Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show( );
                }
            }
        });

    }
}