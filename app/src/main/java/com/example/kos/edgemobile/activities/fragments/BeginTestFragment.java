package com.example.kos.edgemobile.activities.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kos.edgemobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeginTestFragment extends Fragment {


    public BeginTestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_begin_test, container, false);
    }

}
