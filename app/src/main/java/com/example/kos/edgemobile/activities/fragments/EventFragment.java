package com.example.kos.edgemobile.activities.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by roman on 18.01.2018.
 */


// Данный класс нужен для работы с фрагментами
public class EventFragment
{
   private FragmentTransaction fragmentTransaction;
   private Activity activity;
   public EventFragment(FragmentTransaction fragmentTransaction,Activity ThisActivity)
   {
       this.fragmentTransaction=fragmentTransaction;
       this.activity=ThisActivity;
   }
   // Вынес  метод с MainActivity в класс.
    public  void replaceFragments(int id, Fragment fragment){
        fragmentTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}
