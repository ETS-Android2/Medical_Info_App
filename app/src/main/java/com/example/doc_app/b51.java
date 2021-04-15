package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b51);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview111);
        textView.setText(
                "السكتة الدماغية\n" +
                        "\n" +
                        "الصرع\n" +
                        "\n" +
                        "نوبة جزئية بسيطة\n" +
                        "\n" +
                        "نوبة جزئية معقدة\n" +
                        "\n" +
                        "نوبة التغيب\n" +
                        "\n" +
                        "نوبة رمعية عضلية\n" +
                        "\n" +
                        "نوبة توتّريّة إرتجاجية شاملة\n" +
                        "\n" +
                        "الزهايمر\n" +
                        "\n" +
                        "الألم العصبي\n" +
                        "\n" +
                        "الشلل الدماغي\n" +
                        "\n" +
                        "شلل العصب الوجهي\n" +
                        "\n" +
                        "ضمور النخاع الشوكي\n" +
                        "\n" +
                        "ألم العصب الدماغي الخامس\n" +
                        "\n" +
                        "كسر الجمجمة\n" +
                        "\n" +
                        "التهاب الدماغ الياباني\n" +
                        "\n" +
                        "شلل الأطفال \n" +
                        "\n" +
                        "الصداع النصفي\n" +
                        "\n" +
                        "الإغماءات\n" +
                        "\n" +
                        "التهاب الأعصاب الطرفية\n"
        );
    }
}