package com.example.kos.edgemobile.activities.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.domains.Question;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemeFragment extends Fragment
{
    public ThemeFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                          Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tests, null);
    }
}
