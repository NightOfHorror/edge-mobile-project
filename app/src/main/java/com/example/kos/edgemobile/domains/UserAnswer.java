package com.example.kos.edgemobile.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by roman on 17.01.2018.
 */

public class UserAnswer
{
    @SerializedName("UserID")
    @Expose
    private Integer userID;
    @SerializedName("Answers")
    @Expose
    private List<Answer> answers = null;

    public Integer getUserID()
    {
        return userID;
    }

    public void setUserID(Integer userID)
    {
        this.userID = userID;
    }

    public List<Answer> getAnswers()
    {
        return answers;
    }

    public void setAnswers(List<Answer> answers)
    {
        this.answers = answers;
    }

}
