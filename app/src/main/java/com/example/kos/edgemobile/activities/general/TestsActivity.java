package com.example.kos.edgemobile.activities.general;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.activities.fragments.EventFragment;
import com.example.kos.edgemobile.activities.fragments.OptionFragment;
import com.example.kos.edgemobile.activities.fragments.QuestionFragment;
import com.example.kos.edgemobile.activities.fragments.ThemeFragment;
import com.example.kos.edgemobile.domains.Test;

public class TestsActivity extends AppCompatActivity
{

    private QuestionFragment _questionFragment;
    private Test _Test;
    private OptionFragment optionFragment;
    private RelativeLayout relativeLayout;
    private FragmentTransaction fragmentTransaction;
    private FrameLayout container;
    private ThemeFragment themeFragment;
   private EventFragment eventFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);
        _Test =new Test();
        themeFragment = new ThemeFragment();
         optionFragment=new OptionFragment();
         eventFragment=new EventFragment(fragmentTransaction,this);
        relativeLayout=findViewById(R.id.L_TestType);
        _questionFragment=new QuestionFragment();
    }
   @Override
    public void onStart()
   {
       super.onStart();
       eventFragment.replaceFragments(R.id.TestContainer,optionFragment);
   }



   // Выбираем тип теста
   public void Setect_Type(View e)
   {
       switch (e.getId())
       {
           case  R.id.ThemeSelect:
               eventFragment.replaceFragments(R.id.TestContainer,themeFragment);
               break;
           case R.id.SelectTest:
               eventFragment.replaceFragments(R.id.TestContainer,_questionFragment);
       }

   }
}
