package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgV_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgV_tb.setImageDrawable(null);


    }

    public void startt(View view) {
        Intent start = new Intent(this,MainActivity2.class);
        startActivity(start);

    }
}