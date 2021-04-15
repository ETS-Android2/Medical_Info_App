package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class b6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b6);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void x1111(View view) {
        Intent intent = new Intent(this,b61.class);
        startActivity(intent);
    }

    public void x2222(View view) {
        Intent intent = new Intent(this,b62.class);
        startActivity(intent);
    }

    public void x3333(View view) {
        Intent intent = new Intent(this,b63.class);
        startActivity(intent);
    }

    public void x4444(View view) {
        Intent intent = new Intent(this,b64.class);
        startActivity(intent);
    }
}