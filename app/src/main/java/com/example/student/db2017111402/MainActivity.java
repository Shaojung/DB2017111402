package com.example.student.db2017111402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList();
    ListView lv;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        data.add("AAAA");
        data.add("BBB");
        data.add("CCCCC");

        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
    }
}
