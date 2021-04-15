package com.example.doc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quiz extends AppCompatActivity {
    TextView tv;
    Button submitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;


    String questions[] = {
            "كيف كان شعورك خلال الاسبوعين الماضيين بما في ذلك اليوم؟",
            "كيف تشعر حيال المستقبل؟",
            "هل تشعر بالفشل؟",
            "إلى أي مدى تستمتع بالاشياء؟",
            "هل لديك شعور بالذنب؟",
            "هل تشعر بأنك معاقـَب؟",
            "هل تفكر بالانتحار؟",
             };
    String answers[] = {
            "لا اشعر بالحزن.",
            "لا اشعر بالإحباط خاصة حيال المستقبل.",
            "لا اشعر بالفشل.",
            "انا استمتع بالاشياء الان مثلما استمعت بها في الماضي.",
            "لا اشعر بالذنب بشكل خاص.",
            "لا اشعر بأنني معاقـَب.",
            "لا أفكر ابدًا بقتل نفسي.",
    };
    String opt[] = {
            "لا اشعر بالحزن.","انا حزين.","اشعر بالحزن طوال الوقت ولا يمكنني التخلص منه","اشعر بالحزن الشديد او التعاسة حتى انه لا يمكنني تحمل ذلك.",
            "لا اشعر بالإحباط خاصة حيال المستقبل.","اشعر بالإحباط من المستقبل.","اشعر انه ليس لدي ما يمكن توقعه.","اشعر باليأس حيال المستقبل وان الأمور لا يمكن ان تتحسن.",
            "لا اشعر بالفشل.","اشعر بأنني فشلت أكثر من الشخص العادي","عندما القي نظرة إلى الوراء على حياتي, فجُلّ ما اراه هو العديد من الإخفاقات.","أشعر بأنني فشلت فشلا ذريعا كانسان.",
            "انا استمتع بالاشياء الان مثلما استمعت بها في الماضي.","انا لا استمتع بالاشياء الان مثلما استمعت بها في الماضي.","لا اشعر بالاستمتاع الحقيقي في أي شيء.","لا اشعر بالرضا من أي شيء، أو بأن كل شيء قد أصبح مملا.",
            "لا اشعر بالذنب بشكل خاص.","اشعر بالذنب احيانًا.","اشعر بالذنب في معظم الوقت.","اشعر بالذنب طوال الوقت.",
            "لا اشعر بأنني معاقـَب.","اشعر بأنني يمكن أن أعاقـَب","اتوقع بأنني سوف أعاقـَب.","اشعر بأنني معاقـَب.",
            "لا أفكر ابدًا بقتل نفسي.","تساورني الافكار بقتل نفسي ولكنني لن انفذها.","كنت اود قتل نفسي.","سأقتل نفسي إذا اتيحت لي الفرصة.",
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        submitbutton=(Button)findViewById(R.id.button3);
        tv=(TextView) findViewById(R.id.tvque);
        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "الرجاء اختيار احد الاجابات", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if(ansText.equals(answers[flag])) {
                    correct++;
                }
                else {
                    wrong++;
                }
                flag++;
                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(), result.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });


        ImageView imgv_tb=(ImageView)findViewById(R.id.imgv_tb);
        imgv_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

}