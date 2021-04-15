package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b62 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b62);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview2222);
        textView.setText(
                "تقوم خلايا الدم البيضاء بالعديد من الوظائف الهامة وهي:\n" +
                        "\n" +
                        "الوظيفة الأساسية لها هي الدفاع ضد غزو الميكروبات.\n" +
                        "تفرز خلايا الأزينوفيل مادة الهستامين التي تؤثر على الأوعية الدموية فتسبب اتساعها كما تزيد في حالات الحساسية بالجسم.\n" +
                        "تفرز البيزوفيل مادة الهيبارين التي تمنع تجلط الدم.\n" +
                        "تفرز الخلايا الليمفاوية الأجسام المضادة التي إما أن تعادل سموم الميكروبات أو تعمل على ترسيب الميكروبات.\n" +
                        "وظيفة المونوسايت: فهي مثل النيتروفيل تقوم بالتهام البكتريا ولكنها لكبر حجمها فهي تستطيع أيضاً التهام البروتوزوا المختلفة كالأميبيا وغيرها وكذلك تساعد على التئام الأنسجة."
        );
    }
}