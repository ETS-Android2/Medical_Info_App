package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b52);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview222);
        textView.setText(
                "يمكن أن يوجد اختلافٌ كبيرٌ في دلالات الامراض العصبية - الأعراض الناجمة عن اضطرابٍ يُصيبُ كامل الجهاز العصبي أو جزءًا منه - لأن الجهاز العصبي يضبط الكثير من وظائف الجسم المختلفة. يمكن أن تشتملَ الأعراض على جميع أشكال الألم، بما في ذلك الصُّدَاع وألم الظهر. تعتمد العضلات وإحساس الجلد والحواس الخاصة (النظروالذوق والشم والسمع) وغيرها من الحواس على عمل الأعصاب بشكلٍ طبيعي. وبذلك، يمكن أن تشتملَ أعراض الجهاز العصبي على ضُعف العضلات أو نقص التناسُق والإحساس غير الطبيعي في الجلد واضطرابات في البصر والذوق والشم والسمع.\n" +
                        "\n" +
                        "يمكن أن تؤثِّر اضطرابات الجهاز العصبي في النوم، ممَّا يجعل المريض قلقًا أو مضطربًا قبل الخلود إلى النَّوم، وبذلك يشعر بالتعب والنعاس في أثناء النهار.\n" +
                        "\n" +
                        "قد تكونَ الأعراض العصبية طفيفة (مثل تنميل القدم) أو مهددة للحياة (مثل الغيبوبة بسبب السكتة الدماغية)."
        );
    }
}