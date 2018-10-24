package com.example.gabri.poscomp.service;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    public static final String url_base = "https://api.mlab.com/api/1/databases/questions/collections/questions?apiKey=NNUASzvOhixAxOH9Rehk-ItN-UCog5vr";

    @GET("questions?apiKey=NNUASzvOhixAxOH9Rehk-ItN-UCog5vr")
    Call<List<question>> listQuestions();


}
