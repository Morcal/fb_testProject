package com.example.administrator.recycleviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.recycleviewdemo.R;

import java.util.List;

/**
 * Created by Administrator on 2015/10/22.
 */
public class ListItemAdapter extends RecyclerView.Adapter {
    private List list;
    private ViewHolder viewHolder;

    public ListItemAdapter(List list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text, null);
        viewHolder = new ViewHolder(view);
        viewHolder.itemText = (TextView) view.findViewById(R.id.text);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String str = list.get(position).toString();
        viewHolder.itemText.setText(str);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView itemText;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
