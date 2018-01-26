package com.sunshuai.common_adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunshuai on 2018/1/24
 */

public class CommonAdapterPlusActivity extends AppCompatActivity {

    private String[] names = new String[]{"老大", "老二", "老三","老大", "老二", "老三","老大", "老二", "老三","老大", "老二", "老三"};
    private String[] says = new String[]{"我是老大", "我是老二", "我是老三","我是老大", "我是老二", "我是老三","我是老大", "我是老二", "我是老三","我是老大", "我是老二", "我是老三"};
    private int[] imgIds = new int[]{R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round};

    private List<Map<String, Object>> list = new ArrayList<>();
    Map<String, Object> map = new HashMap<>();


    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_adapter_plus);

        mListView = findViewById(R.id.lv);
        for (int i = 0; i < names.length; i++) {
            map.put("name", names[i]);
            map.put("say", says[i]);
            map.put("imgId", imgIds[i]);
            list.add(map);
        }
        mListView.setAdapter(new CommonAdapter<Map<String, Object>>(this, R.layout.listview_common_adapter_plus_item, list) {
            @Override
            protected void convert(ViewHolder viewHolder, Map item, int position) {
                viewHolder.setText(R.id.name, (String) item.get("name"));
                viewHolder.setText(R.id.says, (String) item.get("say"));
                viewHolder.setImageResource(R.id.head_icon, (Integer) item.get("imgId"));
            }
        });


    }
}
