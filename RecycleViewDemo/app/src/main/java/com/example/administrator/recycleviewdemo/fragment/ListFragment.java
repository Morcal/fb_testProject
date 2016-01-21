package com.example.administrator.recycleviewdemo.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.recycleviewdemo.R;
import com.example.administrator.recycleviewdemo.adapter.ListItemAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/22.
 */
public class ListFragment extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private ListItemAdapter listAdapter;
    private List list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.list_item);
        initView();
        initdata();
        return view;
    }

    private void initView() {
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);


    }

    private void initdata() {
        list=new ArrayList();
        for (int i=0;i<20;i++){
            list.add("ListItem"+i);
        }
        listAdapter=new ListItemAdapter(list);
        recyclerView.setAdapter(listAdapter);
    }

}
