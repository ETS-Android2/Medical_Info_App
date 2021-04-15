package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });

//        View v = getLayoutInflater().inflate(R.layout.popupscherm,null);
//        toolbar = (Toolbar) v.findViewById(R.id.toolbarlast);

//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }





//      startbutton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent intent=new Intent(getApplicationContext(),quiz.class);
//            startActivity(intent);
//        }
//    });



    public void symp(View view) {
        Intent symp = new Intent(this,b1.class);
        startActivity(symp);

    }

    public void prevent(View view) {
        Intent prevent = new Intent(this,b2.class);
        startActivity(prevent);

    }

    public void b3(View view) {
        Intent b3 = new Intent(this,b3.class);
        startActivity(b3);

    }

    public void b4(View view) {
        Intent b4 = new Intent(this,b4.class);
        startActivity(b4);
    }

    public void b5(View view) {
        Intent b5 = new Intent(this,b5.class);
        startActivity(b5);
    }

    public void b6(View view) {
        Intent b6 = new Intent(this,b6.class);
        startActivity(b6);
    }

    public void survey_page(View view) {
        Intent survey_page = new Intent(this,quiz.class);
        startActivity(survey_page);
    }
}