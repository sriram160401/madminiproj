package com.example.madmini.project.fragments;
import com.example.madmini.project.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class gal4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.gal4, container, false);
        return v;
    }

    public static gal4 newInstance() {
        gal4 f = new gal4();
        Bundle b = new Bundle();
        f.setArguments(b);
        return f;
    }
}
