package com.example.madmini.project.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.madmini.project.R;

public class gal3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.gal3, container, false);
        return v;
    }

    public static gal3 newInstance() {
        gal3 f = new gal3();
        Bundle b = new Bundle();
        f.setArguments(b);
        return f;
    }
}
