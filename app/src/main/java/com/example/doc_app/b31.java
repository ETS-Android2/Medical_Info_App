package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b31 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b31);
        TextView textView =(TextView) findViewById(R.id.texview1);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        textView.setText(
                "الحساسية - Allergie\n" +
                        "الحساسية (الأرجية – Allergie / Allergy) هي ردة فعل جهاز المناعة (Immune system) لمواد غير مألوفة له، مثل حبيبات اللقاح، السم من جراء لسعة النحل أو وبر الحيوانات.ينتج جهاز المناعة بروتينا..\n" +
                        "\n" +
                        "الربو - Asthma\n" +
                        "الربو (\"الأزمة\" - Asthma) عبارة عن مرض مزمن يصيب الإنسان نتيجة التهاب مجاري الهواء في الرئتين (الشـعب الهوائية – Bronchi) واضيقاقها، الأمر الذي يقلل أو يمنع من تدفق الهواء إلى هذه..\n" +
                        "\n" +
                        "الالتهاب الرئوي - Pneumonia\n" +
                        "الالتهاب الرئوي (Pneumonia) هو تلوث في الرئتين، قد يولد شعورا سيئا جداً.يسبب الالتهاب الرئوي السعال، الحمى (ارتفاع درجة حرارة الجسم) وصعوبات في التنفس. في أغلب الحالات، يمكن معالجة الالتهاب الرئوي..\n" +
                        "\n" +
                        "الزكام - Common Cold\n" +
                        "الزكام (Common cold) او الرشح هو مرض غير خطير تسببه عدة فيروسات.الفيروسات المسببة للزكامالفيروسات التالية تسبب الإصابة بالزكام: الفيروسات الأنفية (Rhinovirus): تسبب 10% - 40% من حالات الزكام الفيروس..\n" +
                        "\n" +
                        "تلوثات المجاري التنفسية العليا - Upper Respiratory Tract Infection\n" +
                        "تلوثات المجاري التنفسية العليا ، من منا لم يعان من مرض في الجهاز التنفسي العلوي؟! إن هذه هي مجموعة أمراض شائعة ذات تكلفة اقتصادية سنوية مرتفعة جدًا. إن عدوى الجهاز التنفسي العلوي، هو مصطلح عام،..\n" +
                        "\n" +
                        "التهاب الحلق - Sore Throat\n" +
                        "التهاب الحلق (Sore throat) يكاد يكون من اكثر الحالات الشائعة في عيادات الأطباء.بحسب الاحصاءات في الولايات الأمريكية اكثر من 12 مليون زيارة سنوية للطبيب كانت بسبب التهابات الحلق...\n" +
                        "\n" +
                        "النفاخ - Emphysema\n" +
                        "إن النفاخ او نفاخ الرئتين (Emphysema of lungs) هو اعتلال يتسم بفرط انتفاخ التجويفات الهوائية في الرئتين والتي تعرف بالـ \"أسناخ\" (Alveoli)؛ والأسناخ هي الأماكن التي يتم فيها تبادل الأكسجين..\n" +
                        "\n" +
                        "داء الحويصلات الهوائية البروتيني - Alveolar proteinosis"+
                        "\n"+"إن داء الحويصلات الهوائية البروتيني، هو عبارة عن مرض نادر والذي يصيب صغار السن من أصول شرقية، ويحدث بسبب تراكم مادة التي تقلل من ضغط الرئة (Surfactant) والبروتينات والدهون الفوسفاتية بالرئتين"
        );
    }
}