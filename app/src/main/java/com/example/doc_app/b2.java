package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView prevent = (TextView)findViewById(R.id.prevent);
        prevent.setText(
                " 1) انتبه للعلامات المنذرة بالمرض يجب ان تعلم بالمناقشة مع طبيبة العلامات التى قد تنذر بحدوث تفاقم في المرض ، و اعداد خطة جيدة للتعامل معها"
                        +"\n"+
                        "2) ابلاغ الطبيب فور حدوث أي تغيرات في الأعراض "
                        +"\n"+
                        "3) تدخل أحد أفراد العائلة أو الأصدقاء الموثوق فيهم لمراقبتك و متابعة الحالة"
                        +"\n"+
                        "4) اطمئن على صحتك باستمرار يجب ألا تنسى الفحص الدوري على جسمك خاصة اذا شعرت بأي مشكلة صحية جديدة" +"\n"+
                        "5) فقد تكون تعاني من أي مرض جسماني يتطلب العلاج ، أو أي آثار جانبية للأدوية" +"\n"+
                        "6) اطلب المساعدة عندما تحتاج لها قد تكون الأمراض النفسية أصعب في العلاج اذا انتظرت حتى تدهور الأعراض" +"\n"+
                        "7) كذلك فان الحفاظ على تناول الأدوية باستمرار لفترات طويلة يمنع و بشكل كبير عودة الأعراض مرة أخرى" +"\n"+
                        "8) اعتنى جيداً بنفسك وبأوقات نومك" +"\n"+
                        "9) تناول لأكل الصحي " +"\n"+
                        "10) انتظام التمارين الرياضية مهم جداً في الوقاية من تدهور الأمراض النفسية" +"\n"+
                        "11) عليك مراجعة طبيبك اذا كنت تعاني من أي مشاكل في النوم أو الشهية"

        );
    }
}