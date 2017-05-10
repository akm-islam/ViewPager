package com.example.mamunjahir.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mamunjahir.myapplication.R;


public class Meet_a_bro extends Fragment {
    public static Meet_a_bro newInstance(){

       return new Meet_a_bro();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.fragment_meet_a_brother,container,false);

        return rootview;
    }
}
