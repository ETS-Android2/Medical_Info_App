package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class b5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b5);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void x111(View view) {
        Intent intent = new Intent(this,b51.class);
        startActivity(intent);
    }
    public void x222(View view) {
        Intent intent = new Intent(this,b52.class);
        startActivity(intent);
    }
    public void x333(View view) {
        Intent intent = new Intent(this,b53.class);
        startActivity(intent);
    }
    public void x444(View view) {
        Intent intent = new Intent(this,b54.class);
        startActivity(intent);
    }
}