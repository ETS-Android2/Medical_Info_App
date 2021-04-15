package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class b4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b4);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void x11(View view) {
        Intent intent = new Intent(this,b41.class);
        startActivity(intent);
    }
    public void x22(View view) {
        Intent intent = new Intent(this,b42.class);
        startActivity(intent);
    }
    public void x33(View view) {
        Intent intent = new Intent(this,b43.class);
        startActivity(intent);
    }
    public void x44(View view) {
        Intent intent = new Intent(this,b44.class);
        startActivity(intent);
    }
}