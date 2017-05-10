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

public class Rush extends Fragment {
public static Rush newInstace(){
    return new Rush();
}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_rush,container,false);
        return rootview;
    }
}
