package com.example.administrator.tablayoutdemo.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.tablayoutdemo.bean.Goods;

import java.util.List;

/**
 * Created by Administrator on 2015/11/4.
 */
public class NewProductAdapter extends BaseAdapter {
    private List<Goods> goods;
    public NewProductAdapter(List<Goods> list){
        this.goods=list;
    }
    @Override
    public int getCount() {
        return goods.size();
    }

    @Override
    public Object getItem(int i) {
        return goods.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        return null;
    }
}
