package com.example.kos.edgemobile.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("themeName")
    @Expose
    private String themeName;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("imgUrls")
    @Expose
    private List<String> imgUrls = null;
    @SerializedName("correctAnswID")
    @Expose
    private Integer correctAnswID;
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
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

    public List<String> getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(List<String> imgUrls) {
        this.imgUrls = imgUrls;
    }

    public Integer getCorrectAnswID() {
        return correctAnswID;
    }

    public void setCorrectAnswID(Integer correctAnswID) {
        this.correctAnswID = correctAnswID;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
