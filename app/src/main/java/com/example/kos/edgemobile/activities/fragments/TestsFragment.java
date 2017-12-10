package com.example.kos.edgemobile.activities.fragments;


import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.domains.Question;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import retrofit2.http.Url;

/**
 * A simple {@link Fragment} subclass.
 */

// Данный класс тоже нужет только для теста

public class TestsFragment extends Fragment
{


    private TextView _QuestionText;
    private TextView _QuestionTheme;
    private ImageView _QuestionImage;
    private Question _Question;
    // Ее в дальнейшем я удалю
    private String _MysorPeremen="На рисунке — схема дорог, связывающих города А, Б, В, Г, Д, Е, Ж, З, И, К. " +
            "По каждой дороге можно двигаться только в одном направлении, указанном стрелкой." +
            " Сколько существует различных путей из города А в город Ж?";

    @Override
    public void onCreate(Bundle  savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Здесь мы будем надувать наш фрагмент данными
        View TestFragment=inflater.inflate(R.layout.fragment_tests,container,false);
        _QuestionTheme=(TextView)TestFragment.findViewById(R.id.QuestionTheme);
        _QuestionText=(TextView)TestFragment.findViewById(R.id.Question);
        _QuestionImage=(ImageView)TestFragment.findViewById(R.id.QuestionImage);
        _QuestionTheme.setText("Задание 15");
        _QuestionText.setText(_MysorPeremen);
        _QuestionImage.setImageResource(R.drawable.ts);

        return TestFragment;

    }
    @Override
    public void onStart()
    {
        super.onStart();

    }

}
