package com.example.mamunjahir.myapplication.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mamunjahir.myapplication.R;
import com.example.mamunjahir.myapplication.Views.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager= (ViewPager) findViewById(R.id.activity_main_viewPager);
       tabLayout= (TabLayout) findViewById(R.id.activity_tab_layout);
        ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager());
       viewpager.setAdapter(adapter);
tabLayout.setupWithViewPager(viewpager);
    }
}


/* We need a tab layout to setupWithViewPager
For viewPager wee need ViewPagerAdapter.There are two ViewPager Adapter
1.FragmentPagerAdapter or 2.FragmentStatePagerAdapter.
=> When you implement a PagerAdapter, you must override the following methods at minimum:
   1.instantiateItem(ViewGroup, int)
   2.destroyItem(ViewGroup, int, Object)
   3.getCount()
   4.isViewFromObject(View, Object)
=> Subclasses only need to implement
   1.getItem(int) and
   2.getCount()      to have a working adapter.
*/