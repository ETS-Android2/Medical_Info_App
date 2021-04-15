package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b42);
        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView textView = (TextView)findViewById(R.id.texview22);
        textView.setText(
                "مرض السكري (Diabetes): في هذا المرض من الشائع جدا حصول أضرار في الجهاز الهضمي، بجميع مركباته: مشاكل في البلع (عسر البلع)، ضرر في أداء المريء الحركيّ، خزل المعدة / شلل المعدة السكري المنشأ (Gastroparesis diabeticorum)، اضطرابات في عمل الأمعاء الدقيقة والقولون تتمثل في آلام البطن، الإمساك، الإسهال وفقدان السيطرة على المصرات. تحدث هذه الاٍضطرابات نتيجة لإصابة الجهاز العصبي المستقل (اعتلال عصبي مستقل سكّري المنشأ - Diabetic autonomic neuropathy).\n"
                +"\n"+
                        "قصور الدرقية (Hypothyroidism): يتميز بالاساس بظهور الإمساك، تدلي المستقيم وحصى في البراز.\n" +
                        "\n"+
                        "فرط الدرقية (Hyperthyroidism): يتميز بالقيء، الإسهال، آلام البطن والهبوط الحاد في الوزن.\n" +"\n"+
                        "فرط الدريقات (Hyperparathyroidism): يتميز بارتفاع مستوى الكلسيوم في الدم مما يسبب الإمساك، الغثيان والقيء"
        );
    }
}