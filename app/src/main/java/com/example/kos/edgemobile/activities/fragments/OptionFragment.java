package com.example.kos.edgemobile.activities.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kos.edgemobile.R;

/**
 * Created by roman on 18.01.2018.
 */

public class OptionFragment extends Fragment
{
    public OptionFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.option_test, null);
    }
}
