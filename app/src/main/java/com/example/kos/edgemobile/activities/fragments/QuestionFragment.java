package com.example.kos.edgemobile.activities.fragments;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kos.edgemobile.R;
import com.example.kos.edgemobile.domains.Question;

/**
 * Created by roman on 16.01.2018.
 */

public class QuestionFragment extends Fragment
{
    private TextView _QuestionText;
    private ImageView _QuestionImage;
    private Question _Question;
    private EditText _AnswerUser;
    private TextInputLayout _AnswerTip;



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View TestFragment=inflater.inflate(R.layout.fragment_question,container,false);

        _QuestionText=(TextView)TestFragment.findViewById(R.id.Question);
        _QuestionImage=(ImageView)TestFragment.findViewById(R.id.QuestionImage);
        _AnswerTip=(TextInputLayout)TestFragment.findViewById(R.id.AnswerTip);
        return TestFragment;

    }
    @Override
    public void onStart()
    {
        super.onStart();

    }
}
