package com.example.gabri.poscomp.service;

import com.google.gson.annotations.SerializedName;

public class question {
    @SerializedName("id")
    int id;
    @SerializedName("statement")
    String statement;
    @SerializedName("alt_a")
    String alt_a;
    @SerializedName("alt_b")
    String alt_b;
    @SerializedName("alt_c")
    String alt_c;
    @SerializedName("alt_d")
    String alt_d;
    @SerializedName("alt_e")
    String alt_e;
    @SerializedName("answer")
    String answer;
    @SerializedName("identifier")
    String identifier;
    @SerializedName("category")
    String category;
    @SerializedName("second_statement")
    String second_statement;

    public question(int id, String statement, String alt_a, String alt_b, String alt_c, String alt_d, String alt_e, String answer, String identifier, String category, String second_statement) {
        this.id = id;
        this.statement = statement;
        this.alt_a = alt_a;
        this.alt_b = alt_b;
        this.alt_c = alt_c;
        this.alt_d = alt_d;
        this.alt_e = alt_e;
        this.answer = answer;
        this.identifier = identifier;
        this.category = category;
        this.second_statement = second_statement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getAlt_a() {
        return alt_a;
    }

    public void setAlt_a(String alt_a) {
        this.alt_a = alt_a;
    }

    public String getAlt_b() {
        return alt_b;
    }

    public void setAlt_b(String alt_b) {
        this.alt_b = alt_b;
    }

    public String getAlt_c() {
        return alt_c;
    }

    public void setAlt_c(String alt_c) {
        this.alt_c = alt_c;
    }

    public String getAlt_d() {
        return alt_d;
    }

    public void setAlt_d(String alt_d) {
        this.alt_d = alt_d;
    }

    public String getAlt_e() {
        return alt_e;
    }

    public void setAlt_e(String alt_e) {
        this.alt_e = alt_e;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSecond_statement() {
        return second_statement;
    }

    public void setSecond_statement(String second_statement) {
        this.second_statement = second_statement;
    }
}
