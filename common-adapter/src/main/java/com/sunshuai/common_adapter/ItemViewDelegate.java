package com.sunshuai.common_adapter;


/**
 * Created by sunshuai on 2018/1/23
 */

public interface ItemViewDelegate<T> {

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);
}
