package com.example.gabri.poscomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import com.example.gabri.poscomp.model.Questions;
import com.example.gabri.poscomp.service.Service;
import com.example.gabri.poscomp.service.bdService;
import com.example.gabri.poscomp.service.question;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.gabri.poscomp.model.model.q;

public class MainActivity extends AppCompatActivity {


    public bdService bd;
    String value;
    String BASE_URL = "https://api.mlab.com/api/1/databases/questions/collections/questions?apiKey=NNUASzvOhixAxOH9Rehk-ItN-UCog5vr";

    // insert your themoviedb.org API KEY here
    String API_KEY = "";
    public static final String[] questions = new String[10];
    List<question> ques;
    Retrofit retrofit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdService db = new bdService();
        try {
            db.connectAndGetApiData();
        }catch (Exception e)
        {
            Log.d("ERROR",e.getMessage());
        }

        ImageButton telaQuestion = (ImageButton) findViewById(R.id.irTelaSelecao);

        telaQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                Intent it = new Intent(MainActivity.this, questions.class);
                startActivity(it);
            }
        });



    }

    }









