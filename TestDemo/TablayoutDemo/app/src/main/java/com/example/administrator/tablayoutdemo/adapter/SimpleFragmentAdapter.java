package com.example.administrator.tablayoutdemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.tablayoutdemo.fragment.HomeFragment;
import com.example.administrator.tablayoutdemo.fragment.SpecialFragment;
import com.example.administrator.tablayoutdemo.fragment.SubjectFragment;

/**
 * Created by Administrator on 2015/10/26.
 */
public class SimpleFragmentAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] {"首页", "特卖", "专题"};
    private Context context;

    public SimpleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
        case 0:
            return HomeFragment.newInstance(position);
        case 1:
            return SpecialFragment.newInstance(position + 1);
        case 2:
            return SubjectFragment.newInstance(position);
        default:
            return null;

        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
