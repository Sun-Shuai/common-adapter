package com.sunshuai.common_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class CommonAdapterActivity extends AppCompatActivity {

    private List<String> list = new ArrayList<>();
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_adapter);
        mListView = findViewById(R.id.lv);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        mListView.setAdapter(new CommonAdapter<String>(this, R.layout.listview_common_adapter_item, list) {
            @Override
            public void convert(ViewHolder holder, String item, int pos) {
                holder.setText(R.id.id_item_list_title, item);
            }
        });


    }

    public void next(View view) {
        Intent intent = new Intent(this, CommonAdapterPlusActivity.class);
        startActivity(intent);
    }
}
