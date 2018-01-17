package com.example.kos.edgemobile.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Константин on 02.12.2017.
 */

public class Answer
{
    @SerializedName("QuestionID")
    @Expose
    private Integer questionID;
    @SerializedName("TextAnswer")
    @Expose
    private String textAnswer;

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getTextAnswer()
    {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer)
    {
        this.textAnswer = textAnswer;
    }
}
