package com.example.kos.edgemobile.domains;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Test {

    @SerializedName("question")
    @Expose
    private List<Question> question = null;
    @SerializedName("_id")
    @Expose
    private String id;

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
