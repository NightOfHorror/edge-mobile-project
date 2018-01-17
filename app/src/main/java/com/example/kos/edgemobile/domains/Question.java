package com.example.kos.edgemobile.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Константин on 02.12.2017.
 */

public class Question
{
    @SerializedName("QuestionID")
    @Expose
    private Integer questionID;
    @SerializedName("CategoryName")
    @Expose
    private String categoryName;
    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("ImgUrls")
    @Expose
    private List<String> imgUrls;

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(List<String> imgUrls) {
        this.imgUrls = imgUrls;
    }


}
