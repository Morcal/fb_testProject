package com.example.administrator.tablayoutdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.tablayoutdemo.R;

/**
 * Created by Administrator on 2015/10/26.
 */
public class SpecialFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static SpecialFragment newInstance(int page) {
        Bundle arges = new Bundle();
        arges.putInt(ARG_PAGE, page);
        SpecialFragment specialFragment = new SpecialFragment();
        specialFragment.setArguments(arges);
        return specialFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_special, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_show);
        textView.setText("SpecialFragment");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }
}
