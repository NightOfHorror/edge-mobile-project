package com.example.kos.edgemobile.activities.general;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.activities.fragments.ProfileFragment;
import com.example.kos.edgemobile.activities.fragments.StatsFragment;
import com.example.kos.edgemobile.activities.fragments.TestsFragment;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    TestsFragment testsFragment;
    StatsFragment statsFragment;
    ProfileFragment profileFragment;
    FragmentTransaction fragmentTransaction;

    @BindViews({R.id.nav_personal, R.id.nav_tests, R.id.nav_stats})
    List<View> btnNavList;

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;

    @BindView(R.id.frame_container)
    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        profileFragment = new ProfileFragment();
        testsFragment = new TestsFragment();
        statsFragment = new StatsFragment();

        // Menu item's click handler
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_personal:
                    // TODO nav_personal click
                    replaceFragments(R.id.frame_container, profileFragment);
                    break;
                case R.id.nav_tests:
                    // TODO nav_tests click
                    replaceFragments(R.id.frame_container, testsFragment);
                    break;
                case R.id.nav_stats:
                    // TODO nav_stats click
                    replaceFragments(R.id.frame_container, statsFragment);
                    break;
            }
            return true;
        });
    }

    // Fragment replace
    public void replaceFragments(int id, Fragment fragment){
        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}
