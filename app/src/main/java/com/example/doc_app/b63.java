package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b63 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b63);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview3333);
        textView.setText(
                "هناك عدة أنواع مختلفة ومتنوعة من الكريات البيضاء، لكنها جميعا تتشكل من خلية جذعية متعددة القدرات في نخاع العظام المعروفة باسم خلية جذعية مكونة للدم."
        );
    }
}