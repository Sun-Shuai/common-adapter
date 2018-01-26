package com.sunshuai.common_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends AppCompatActivity {

    private String[] names = new String[]{"老大", "老二", "老三"};
    private String[] says = new String[]{"无形被黑，最为致命", "大神好厉害~", "我将带头日狗~"};
    private int[] imgIds = new int[]{R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);


        List<Map<String, Object>> listitem = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<>();
            showitem.put("icon", imgIds[i]);
            showitem.put("name", names[i]);
            showitem.put("says", says[i]);
            listitem.add(showitem);
        }

        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.listview_simple_adapter_item, new String[]{"icon", "name", "says"}, new int[]{R.id.head_icon, R.id.name, R.id.says});
        ListView listView = findViewById(R.id.lv);
        listView.setAdapter(myAdapter);


    }

    public void next(View view) {
        Intent intent = new Intent(this, CommonAdapterActivity.class);
        startActivity(intent);
    }
}
