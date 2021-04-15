package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class b1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
        TextView symp1 = (TextView) findViewById(R.id.symp);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        symp1.setText(
                "العلامات والأعراض التي تتعلق بالمرض العقلي يمكن أن تختلف وتتباين استنادا إلى الاضطراب والملابسات وعوامل أخرى يمكن أن تؤثِّر أعراض المرض العقلي على المشاعر والأفكار والسلوكيات\n" +
                "1) الشعور بالحزن أو الكآبة\n" +
                        "2) التفكير المشوَّش وضعف القدرة على التركيز\n" +
                        "3) المخاوف الشديدة أو القلق أو الإفراط في الشعور بالذنب\n" +
                        "4) تغييرات حادة في الحالة المزاجية ارتفاعًا وانخفاضًا\n" +
                        "5) الابتعاد عن الأصدقاء والأنشطة المعتادة\n" +
                        "6) التعب الشديد وانخفاض الطاقة أو مشاكل النوم\n" +
                        "7) الانعزال عن الواقع (الأوهام) أو البارانويا أو الهلاوس\n" +
                        "8) عدم القدرة على مواجهة المشاكل اليومية أو الضغوطات\n" +
                        "9) صعوبة في الاستيعاب ومشكلات في فهم المواقف والأشخاص والتعامل معهم\n" +
                        "10) اضطرابات بسبب الكحوليات أو المخدرات\n" +
                        "11) تغيرات كبيرة في عادات الأكل\n" +
                        "12) تغيرات في الدوافع الجنسية\n" +
                        "13) الغضب الشديد أو العدائية أو العنف\n" +
                        "14) التفكير في الانتحار\n" +
                        "15) إن أعراض اضطرابات الصحة العقلية أحيانا تظهر في صورة مشاكل جسدية مثل ألم بالمعدة أو الظهر أو صداع أو أية آلام أخرى لا تجد لها سببا");
    }
}
