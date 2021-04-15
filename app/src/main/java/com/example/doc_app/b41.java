package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b41);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview11);
        textView.setText(
                "حرقة المعدة - Heartburn\n" +
                        "\n" +
                        "القولون العصبي - Irritable Bowel Syndrome\n" +
                        "\n" +
                        "التهاب الكبد ب - Hepatitis B\n" +
                        "\n" +
                        "الداء الزلاقي - Celiac Disease\n" +
                        "\n" +
                        "الاسهال - Diarrhea\n" +
                        "\n" +
                        "التهاب الكبد الشبيه بالذئبة - Hepatitis C\n" +
                        "\n" +
                        "التهاب المعدة - Gastritis\n" +
                        "\n" +"حصى المرارة - Gallstones\n" +
                        "\n" +
                        "التهاب الأمعاء الغليظة التقرحي - Ulcerative Colitis\n" +
                        "\n" +
                        "تليف الكبد - Cirrhosis\n" +
                        "\n" +
                        "الغازات - Flatus\n" +
                        "\n" +
                        "الكبد الدهني - Fatty Liver\n" +
                        "\n" +
                        "الفشل الكبدي - Hepatic Failure\n" +
                        "\n" +
                        "" +
                        "التهاب القولون التقرحي - Ulcerative Colitis\n" +
                        "\n" +
                        "عسر الهضم - Dyspepsia\n" +
                        "\n" +
                        "التهاب المعدة والأمعاء - Gastroenteritis\n" +
                        "\n" +
                        "تشمع المرارة الأولي - Primary Biliary Cirrhosis\n" +
                        "\n"
        );
    }
}