package com.example.administrator.recycleviewdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.recycleviewdemo.R;
import com.example.administrator.recycleviewdemo.adapter.GridItemAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/22.
 */
public class GridFragment extends Fragment {
    private RecyclerView recyclerView;
    private GridItemAdapter adapter;
    private List list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.grid_item);
        initView();
        inttData();
        return view;
    }

    private void inttData() {
        list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add("GridItem" + i);
        }
        adapter = new GridItemAdapter(list);
        recyclerView.setAdapter(adapter);

    }

    private void initView() {
        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(manager);
    }
}
