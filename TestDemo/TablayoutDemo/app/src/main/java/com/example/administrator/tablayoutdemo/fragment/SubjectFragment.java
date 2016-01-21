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
 *
 */
public class SubjectFragment extends Fragment{

    public static final String ARG_PAGE="ARG_PAGE";
    private int mPage;


    public static SubjectFragment newInstance(int page){
        Bundle arges=new Bundle();
        arges.putInt(ARG_PAGE,page);
        SubjectFragment subjectFragment= new SubjectFragment();
        subjectFragment.setArguments(arges);
        return subjectFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_subject,container,false);
        TextView textView= (TextView) view.findViewById(R.id.text_show);
        textView.setText("SubjectFragment");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage=getArguments().getInt(ARG_PAGE);
    }
}
