package com.sunshuai.common_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdapterActivity extends AppCompatActivity {

    ListView listView1;
    ListView listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        listView1 = findViewById(R.id.lv_1);
        listView2 = findViewById(R.id.lv_2);


        String[] strings = {"1", "2", "3", "4", "5", "5", "5", "5", "5", "5", "8", "5", "5"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>
                (this, R.layout.listview_array_adapter_item, strings);
        listView1.setAdapter(adapter1);


        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("J");
        list.add("B");
        list.add("B");
        list.add("B");
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>
                (this, R.layout.listview_array_adapter_item, list);
        listView2.setAdapter(adapter2);

    }

    public void next(View view) {
        Intent intent = new Intent(this, SimpleAdapterActivity.class);
        startActivity(intent);
    }
}
