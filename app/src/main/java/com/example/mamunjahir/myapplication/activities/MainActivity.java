package com.example.mamunjahir.myapplication.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.mamunjahir.myapplication.R;
import com.example.mamunjahir.myapplication.Views.MainActivityViewPager;

public class MainActivity extends AppCompatActivity {
ViewPager mainviewpager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainviewpager= (ViewPager) findViewById(R.id.activity_main_viewPager);
       tabLayout= (TabLayout) findViewById(R.id.activity_tab_layout);
        MainActivityViewPager adapter =new MainActivityViewPager(getSupportFragmentManager());
       mainviewpager.setAdapter(adapter);
tabLayout.setupWithViewPager(mainviewpager);

    }
}
