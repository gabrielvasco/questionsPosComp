package com.example.gabri.poscomp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class questions extends AppCompatActivity {
    public bdService bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        bd = new bdService();
        bd.buscarQuestions();
        ImageButton buscarBanco = (ImageButton) findViewById(R.id.buscarBanco);
        final TextView visualizarBanco = (TextView) findViewById(R.id.visualizarBanco);
        ImageView image = (ImageView) findViewById(R.id.questao);
        final String linkImage = "http://www.guiadaobra.net/imagens/humor/pedreiro-bom-pra-cachorro-1.jpg";
        Picasso.with(this).load(linkImage).into(image);

        buscarBanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                try {
                    visualizarBanco.setText(linkImage+"\n"+ bd.getResp());
                }catch (Exception e)
                {
                    visualizarBanco.setText(e.getMessage());
                }
            }
        });

    }

}
