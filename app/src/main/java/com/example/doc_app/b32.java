package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b32);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView =(TextView) findViewById(R.id.texview2);
        textView.setText(
                "من الأسباب الشائعة، والتي يمكن تحديدها كمسببات لأمراض الرئة المقيدة (Restrictive lung diseases)، بنوعية العمل الذي يشمل التعرض للغبار العضوي أو غير العضوي. أمثلة على ذلك، الأسبست (Asbestos)، السيليكا (Silica)، غبار الفحم، ألياف القطن، غبار الحبوب، العفن وغيرها. يساهم التدخين، في الحاضر أو الماضي، أيضًا في تفاقم المرض. إن بعض أمراض الرئة المقيّدة شائعة أكثر وسط عائلات معيّنة.\n" +
                        "\n" +
                        "إن داء الأسبست (Asbestosis) هو أحد أمراض المهنة الأكثر شيوعًا، والتي تنجم عن التعرض للأسبست في إطار العمل. لا يزال الأسبست، الموجود في مبان معينة، يشكل مصدرًا أساسيًّا للأمراض الرئوية المزمنة. إن التعرض للأسبست منوط باحتمال أكبر للإصابة بسرطان غلاف الرئة، والذي يدعى سرطان المتوسطة (Mesothelioma). تم وصف حالة، في المراجع الطبية، لامرأة أصيبت بسرطان المتوسطة، بعدما كانت تغسل لعدة سنين ملابس زوجها الذي كان يعمل في مصنع للأسبست."
        );
    }
}