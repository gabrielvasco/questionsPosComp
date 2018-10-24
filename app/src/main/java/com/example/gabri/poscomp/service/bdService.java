package com.example.gabri.poscomp.service;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import static com.example.gabri.poscomp.model.model.q;

public class bdService {

    String BASE_URL = "https://api.mlab.com/api/1/databases/questions/collections/";
    String apiKey="";
    // insert your themoviedb.org API KEY here
    Retrofit retrofit = null;
    String API_KEY = "";

    public void connectAndGetApiData(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        Service movieApiService = retrofit.create(Service.class);
        Call<List<question>> call = movieApiService.listQuestions();
        call.enqueue(new Callback<List<question>>() {
            @Override
            public void onResponse(Call<List<question>> call, Response<List<question>> response) {
                q = response.body();
                //recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
                Log.d("Teste", "Number of movies received: " + q.get(0).getAlt_a());
            }

            @Override
            public void onFailure(Call<List<question>> call, Throwable t) {
                Log.d("ERROR", t.getMessage());
            }

        });
    }
}
