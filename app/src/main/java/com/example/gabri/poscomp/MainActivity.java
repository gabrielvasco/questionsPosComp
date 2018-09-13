package com.example.gabri.poscomp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;

import android.widget.TextView;
import android.widget.Toast;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends AppCompatActivity {

String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.texto);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://api.mlab.com/api/1/databases/questions/collections/questions?apiKey=NNUASzvOhixAxOH9Rehk-ItN-UCog5vr");

                    HttpsURLConnection myConnection =
                            (HttpsURLConnection) url.openConnection();
                    myConnection.setRequestMethod("GET");

                    StringBuilder resposta = new StringBuilder();

                    Scanner scanner = new Scanner(url.openStream());
                    while (scanner.hasNext()) {
                        resposta.append(scanner.next());
                    }

                    t.setText(resposta);
                }catch (Exception e)
                {

                }
            }
        });



    }
    private static String converterInputStreamToString(InputStream is){
        StringBuffer buffer = new StringBuffer();
        try{
            BufferedReader br;
            String linha;

            br = new BufferedReader(new InputStreamReader(is));
            while((linha = br.readLine())!=null){
                buffer.append(linha);
            }

            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return buffer.toString();
    }


    }









