package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class b3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b3);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void x1(View view) {
        Intent intent = new Intent(this,b31.class);
        startActivity(intent);
    }

    public void x2(View view) {
        Intent intent = new Intent(this,b32.class);
        startActivity(intent);
    }

    public void x3(View view) {
        Intent intent = new Intent(this,b33.class);
        startActivity(intent);
    }

    public void x4(View view) {
        Intent intent = new Intent(this,b34.class);
        startActivity(intent);
    }


}