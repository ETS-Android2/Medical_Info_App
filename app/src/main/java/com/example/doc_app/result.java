package com.example.doc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity  {
    TextView tv3, tvo;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv3 = (TextView)findViewById(R.id.tvres3);
        tvo = (TextView)findViewById(R.id.tvo);
        btnRestart = (Button) findViewById(R.id.btnRestart);
        StringBuffer sb3 = new StringBuffer();
        sb3.append("علامة الاختبار هي (" + quiz.correct + ") من اصل (7) ");
        tv3.setText(sb3);
//        quiz.correct=0;
//        quiz.wrong=0;

        if (quiz.correct < 4){

            Toast.makeText(getApplicationContext(), "علامتك في الاختبار سيئة ننصح بالاهتمام بصحتك النفسية اكثر", Toast.LENGTH_SHORT).show();
            tvo.setText("علامتك في الاختبار سيئة ننصح بالاهتمام بصحتك النفسية اكثر");
            tvo.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.ic_remove, 0, 0, 0);
        }


        if (quiz.correct >= 4){

            Toast.makeText(getApplicationContext(), "صحتك النفسية جيدة نرجو لك الاستمرار هكذا", Toast.LENGTH_SHORT).show();
            tvo.setText("صحتك النفسية جيدة نرجو لك الاستمرار هكذا");
            tvo.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.ic_correct, 0, 0, 0);
        }


        quiz.correct=0;
        quiz.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(in);
            }
        });



//        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
//        imgv_tb.setImageDrawable(null);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(in);
            }
        });


    }

}
