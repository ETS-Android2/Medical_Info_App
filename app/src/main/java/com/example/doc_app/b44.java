package com.example.doc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class b44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b44);

        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView textView = (TextView)findViewById(R.id.texview44);
        textView.setText(
                "بعض النصائح الإضافية لتسهيل عملية الهضم\n" +
                        "إليك أهم النصائح هذه النصائح:\n" +
                        "\n" +
                        "يبدأ الهضم الجيد في العقل: لذلك تأكد دائما من تناول طعامك في مكان مريح. فالإجهاد والقلق يتدخلوا في عملية الهضم.\n" +
                        "عليك بمضغ طعامك جيدا وأكله ببطء: فاللعاب هو انزيم هاضم حيوي، وإذا كنت تمضغ بشكل صحيح، في الوقت الذي يصل طعامك إلى معدتك، والنشا والسليلوز تكون عملية الهضم أسهل.\n" +
                        "تذكر كل شيء تتناوله ولا يشعرك بالراحة: فيمكنك في المرات المقبلة تجنب هذه الأطعمة أو الحرص من عدم الإكثار منها.\n" +
                        "عليك بالحرص على تناول وجبة الإفطار: والحصول على وجبات خفيفة صحية في منتصف الصباح ومنتصف بعد الظهر.\n" +
                        "شرب الماء طوال اليوم: لأنه يساعد على الهضم ويمنع الإمساك.\n" +
                        "ممارسة الرياضة البدنية: يساعد الدورة الدموية ويحفز العضلات في الجهاز الهضمي، وبالتالي يساعد في عملية الهضم."
        );
    }
}