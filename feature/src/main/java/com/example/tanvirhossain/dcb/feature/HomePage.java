package com.example.tanvirhossain.dcb.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    ImageView complain , user, forum , problem, judge, info;
    TextView com,use,faqs,credit,foru,prob,judg,infu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        complain = (ImageView)findViewById(R.id.imageView18);
        complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Complain.class);
                startActivity(it);
                //finish();
            }
        });
        user = (ImageView)findViewById(R.id.imageView6);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Profile.class);
                startActivity(it);
                //finish();
            }
        });
        forum = (ImageView)findViewById(R.id.imageView19);
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(HomePage.this,Forum.class);
                startActivity(it);
                //finish();
            }
        });
        problem = (ImageView)findViewById(R.id.imageView21);
        problem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(HomePage.this,Problems.class);
                startActivity(it);
                //finish();
            }
        });
        judge = (ImageView)findViewById(R.id.imageView20);
        judge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(HomePage.this,JudgePanel.class);
                startActivity(it);
                //finish();
            }
        });
        info =(ImageView)findViewById(R.id.imageView17);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent (HomePage.this,Info.class);
                startActivity(it);
                //finish();
            }
        });
        faqs = (TextView)findViewById(R.id.textView10);
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Faqs.class);
                startActivity(it);
                //finish();
            }
        });
        credit =(TextView)findViewById(R.id.textView12);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(HomePage.this,Credit.class);
                startActivity(it);
                //finish();

            }
        });
        com =(TextView)findViewById(R.id.textView13);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent (HomePage.this,Complain.class);
                startActivity(it);
                //finish();
            }
        });
        use =(TextView)findViewById(R.id.User);
        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Profile.class);
                startActivity(it);
                //finish();
            }
        });
        foru =(TextView)findViewById(R.id.textView3);
        foru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Forum.class);
                startActivity(it);
                //finish();
            }
        });
        prob =(TextView)findViewById(R.id.textView9);
        prob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,Problems.class);
                startActivity(it);
                //finish();
            }
        });
        judg =(TextView)findViewById(R.id.textView7);
        judg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(HomePage.this,JudgePanel.class);
                startActivity(it);
                //finish();
            }
        });
        infu=(TextView)findViewById(R.id.textView8);
        infu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to=new Intent(HomePage.this,Info.class);
                startActivity(to);
                //finish();
            }
        });
    }
}
