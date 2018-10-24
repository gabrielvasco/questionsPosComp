package com.example.gabri.poscomp;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.gabri.poscomp.model.Questions;
import com.example.gabri.poscomp.service.question;
import com.squareup.picasso.Picasso;
import static com.example.gabri.poscomp.model.model.q;

public class questions extends AppCompatActivity {
    public bdServiceOld bd;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        bd = new bdServiceOld();
        bd.buscarQuestions();

        Button opc_a = (Button) findViewById(R.id.A);
        Button opc_b = (Button) findViewById(R.id.B);
        Button opc_c = (Button) findViewById(R.id.C);
        Button opc_d = (Button) findViewById(R.id.D);
        Button opc_e = (Button) findViewById(R.id.E);
        opc_a.setBackgroundColor(Color.RED);

        Button OK = (Button) findViewById(R.id.OK);
        final TextView titulo = (TextView) findViewById(R.id.titulo);
        final TextView corpo = (TextView) findViewById(R.id.corpo);
        final ImageView image = (ImageView) findViewById(R.id.imagemCorpo);
        final TextView corpo1 = (TextView) findViewById(R.id.corpo1);
        final TextView opcA = (TextView) findViewById(R.id.opcA);
        final TextView opcB = (TextView) findViewById(R.id.opcB);
        final TextView opcC = (TextView) findViewById(R.id.opcC);
        final TextView opcD = (TextView) findViewById(R.id.opcD);
        final TextView opcE = (TextView) findViewById(R.id.opcE);

        //questao
        question qq =q.get(0);
        titulo.setText("Fundamentos 1");
        corpo.setText(qq.getStatement());
        final String linkImage = "https://raw.githubusercontent.com/gabrielfdg10/PosCOMP-API/master/img/"+qq.getIdentifier()+".PNG";
        corpo1.setText(qq.getSecond_statement());
        opcA.setText("A) "+qq.getAlt_a());
        opcB.setText("B) "+qq.getAlt_b());
        opcC.setText("C) "+qq.getAlt_c());
        opcD.setText("D) "+qq.getAlt_d());
        opcE.setText("E) "+qq.getAlt_e());

        Picasso.with(this).load(linkImage).into(image);
        //image.setVisibility(View.INVISIBLE);

        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                try {
                    corpo.setText(bd.getResp());
                    //image.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    corpo.setText(e.getMessage());
                }
            }
        });
    }

}
