package com.example.mamunjahir.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mamunjahir.myapplication.R;

public class About_us extends Fragment {
    public static About_us newInstance(){
        return new About_us();
    }



String[] data={"Mamun","Jahir","Hello","Mamun","Jahir","Hello","Mamun","Jahir","Hello","Mamun","Jahir","Hello"};
    ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.fragment_about,container,false);
        lv= (ListView) rootview.findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        return rootview;
    }
}
