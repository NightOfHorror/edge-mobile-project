package com.example.kos.edgemobile.activities.models;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roman on 17.01.2018.
 */

public class ModelQuestion implements Parcelable
{
    @SerializedName("Question")
    private String Question;
    @SerializedName("QuestionImage")
    private String QuestionImage;
    @SerializedName("AnswerUser")
    private String AnswerUser;

    public static final Parcelable.Creator<ModelQuestion> CREATOR = new Parcelable.Creator<ModelQuestion>()
    {
        @Override
        public ModelQuestion  createFromParcel(Parcel source) {
            return new ModelQuestion(source);
        }
        @Override
        public ModelQuestion[] newArray(int size)
        {
            return new ModelQuestion[size];
        }

    };

    private ModelQuestion(Parcel in)
    {
     this.Question=in.readString();
     this.QuestionImage=in.readString();
     this.AnswerUser=in.readString();
    }
    @Override
    public int describeContents()
    {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(Question);
        dest.writeString(QuestionImage);
        dest.writeString(AnswerUser);
    }
    public String getQuestion()
    {
        return Question;
    }
    public void setQuestion(String text)
    {
        this.Question=text;

    }
    public String getQuestionImage()
    {
        return this.QuestionImage;
    }
    public void  setQuestionImage(String text)
    {
        this.QuestionImage=text;
    }



}