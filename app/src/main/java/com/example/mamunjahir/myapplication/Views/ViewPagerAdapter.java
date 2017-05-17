package com.example.mamunjahir.myapplication.Views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mamunjahir.myapplication.fragments.About_us;
import com.example.mamunjahir.myapplication.fragments.Meet_a_bro;
import com.example.mamunjahir.myapplication.fragments.Rush;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = About_us.newInstance();
                break;
            case 1:
                fragment = Meet_a_bro.newInstance();
                break;
            case 2:
                fragment = Rush.newInstace();
                break;
            default:
                return null;
        }
        return fragment;
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
           CharSequence title;   //charseq is data type just like integer
        switch (position){
            case 0:
                title ="About us";
                break;
            case 1:
                title="Meet_changed";
                break;
            case 2:
                title ="Rush";
                        break;
            default:
                return null;
        }

        return title;
    }
}
