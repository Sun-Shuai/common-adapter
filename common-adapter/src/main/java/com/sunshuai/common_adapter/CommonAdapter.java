package com.sunshuai.common_adapter;

import android.content.Context;

import java.util.List;

/**
 * Created by sunshuai on 2018/1/23
 * 一般的就用这个CommonAdapter就够了，不够的自己继承SuperAdapter
 */


public abstract class CommonAdapter<T> extends SuperAdapter<T> {

    public CommonAdapter(Context context, final int layoutId, List<T> datas) {
        super(context, datas);

        addItemViewDelegate(new ItemViewDelegate<T>() {
            @Override
            public int getItemViewLayoutId() {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position) {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position) {
                CommonAdapter.this.convert(holder, t, position);
            }
        });
    }

    protected abstract void convert(ViewHolder viewHolder, T item, int position);

}
