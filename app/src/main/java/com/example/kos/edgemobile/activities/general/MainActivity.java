package com.example.kos.edgemobile.activities.general;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.domains.Test;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{

    private Intent _TestsActivity;
    @BindViews({R.id.nav_personal, R.id.nav_tests, R.id.nav_stats})
    List<View> btnNavList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        TestsActivity act= new TestsActivity();

        _TestsActivity =new Intent(MainActivity.this,TestsActivity.class);

    }

    // Menu item's click handler
    @OnClick({R.id.nav_personal, R.id.nav_tests, R.id.nav_stats})
    void onSaveClick(View view) {
        switch (view.getId()){
            case R.id.nav_personal:
                // TODO nav_personal click
                Toast.makeText(this, "NAV PERSONAL CLICKED", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_tests:
                    //this.onPause();
                    startActivity(_TestsActivity);
                    break;

            case R.id.nav_stats:
                // TODO nav_stats click
                Toast.makeText(this, "NAV STATS CLICKED", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
