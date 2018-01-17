package com.example.kos.edgemobile.activities.general;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.activities.fragments.EventFragment;
import com.example.kos.edgemobile.activities.fragments.NewsFragment;
import com.example.kos.edgemobile.activities.fragments.ProfileFragment;
import com.example.kos.edgemobile.activities.fragments.StatsFragment;
import com.example.kos.edgemobile.activities.fragments.StartTestFragment;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    StartTestFragment startTestFragment;
    StatsFragment statsFragment;
    ProfileFragment profileFragment;
    NewsFragment newsFragment;
    FragmentTransaction fragmentTransaction;

    @BindViews({R.id.nav_personal, R.id.nav_tests, R.id.nav_stats, R.id.nav_news})
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
        startTestFragment=new StartTestFragment();
        statsFragment = new StatsFragment();
        newsFragment = new NewsFragment();
        EventFragment eventFragment =new EventFragment(fragmentTransaction,this);


        // Menu item's click handler
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_personal:
                    // TODO nav_personal click
                   eventFragment.replaceFragments(R.id.frame_container, profileFragment);
                    break;
                case R.id.nav_tests:
                    // TODO nav_tests click
                    eventFragment.replaceFragments(R.id.frame_container, startTestFragment);
                    break;
                case R.id.nav_stats:
                    // TODO nav_stats click
                    eventFragment.replaceFragments(R.id.frame_container, statsFragment);
                    break;
                case R.id.nav_news:
                    // TODO nav_news click
                    eventFragment.replaceFragments(R.id.frame_container, newsFragment);
            }
            return true;
        });
    }

    public void BeginTest_Click(View e)
    {
        Intent intent =new Intent(this, TestsActivity.class);
        startActivity(intent);
    }
}
