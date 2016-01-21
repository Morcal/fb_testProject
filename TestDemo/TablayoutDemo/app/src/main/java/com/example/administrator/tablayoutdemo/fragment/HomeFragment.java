package com.example.administrator.tablayoutdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.tablayoutdemo.R;
import com.example.administrator.tablayoutdemo.bean.Goods;

import java.util.List;

/**
 * Created by Administrator on 2015/10/26.
 */
public class HomeFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private List<Goods> list;
    private ListView listView;

    public static HomeFragment newInstance(int page) {
        Bundle arges = new Bundle();
        arges.putInt(ARG_PAGE, page);
        HomeFragment homeFragment = new HomeFragment();
        homeFragment.setArguments(arges);
        return homeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) view.findViewById(R.id.list_home);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CreateAdpter();
        showData();
    }

    private void CreateAdpter() {
    //new Adapter
    }

    private void showData() {
        //manager

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }
}
