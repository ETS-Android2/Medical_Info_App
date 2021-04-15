package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b64 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b64);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview4444);
        textView.setText(
                "خلية متعادلة\n" +
                        "خلية حمضية " +
                        "خلية قاعدية\n" +
                        "الخلايا البائية\n" +
                        "الخلايا التائية\n" +
                        "السامة: الخلايا المصابة بالفيروسات والخلايا الورمية\n" +
                        "القتلة الطبيعيون: الخلايا المصابة بالفيروسات والخلايا الورمية.\n" +
                        "خلية وحيدة\n" + "خلية بلعمية\n"
        );
    }
}