package com.example.mamunjahir.myapplication.Views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mamunjahir.myapplication.fragments.About_us;
import com.example.mamunjahir.myapplication.fragments.Meet_a_bro;
import com.example.mamunjahir.myapplication.fragments.Rush;

public class MainActivityViewPager extends FragmentStatePagerAdapter {

    public MainActivityViewPager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position) {
            case 0:
                returnFragment = About_us.newInstance();
                break;
            case 1:
                returnFragment = Meet_a_bro.newInstance();
                break;
            case 2:
                returnFragment = Rush.newInstace();
                break;
            default:
                return null;
        }
        return returnFragment;
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
CharSequence title;
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
