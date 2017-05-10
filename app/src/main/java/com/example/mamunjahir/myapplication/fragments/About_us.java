package com.example.mamunjahir.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mamunjahir.myapplication.R;

/**
 * Created by mamunjahir on 1/2/2017.
 */

public class About_us extends Fragment {
    public static About_us newInstance(){
        return new About_us();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.fragment_about,container,false);
        return rootview;
    }
}
