package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b34);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview4);
        textView.setText(
                "عدم التنقل المفاجيء بين الطقس الحار والبارد.\n" +
                        "النزول في الأجواء الباردة.\n" +
                        "تناول السوائل الدافئة: وذلك بشكل مستمر، مثل النعناع، اليانسون، والشاي الأخضر.\n" +
                        "عدم إجهاد الجسم.\n" +
                        "التغذية الصحية: والتي تشمل تناول الخضروات والفاكهة الغنية بالفيتامينات وخاصةً فيتامين سي.\n" +
                        "تناول عسل النحل: حيث يساعد كثيراً في الشفاء ويفضل إستخدامه بدلاً من السكر في التحلية"
        );
    }
}