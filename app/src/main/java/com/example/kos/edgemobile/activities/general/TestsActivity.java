package com.example.kos.edgemobile.activities.general;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.activities.fragments.TestsFragment;

public class TestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);
        FragmentManager fragmentManager =getSupportFragmentManager();
        Fragment fragment =fragmentManager.findFragmentById(R.id.container);
        if(fragment==null)
        {
            fragment=new TestsFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.container,fragment)
                    .commit();

        }
    }

}
