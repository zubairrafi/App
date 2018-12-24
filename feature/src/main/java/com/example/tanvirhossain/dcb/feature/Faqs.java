package com.example.tanvirhossain.dcb.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Faqs extends AppCompatActivity {
    TextView faq1,faq2,faq3,faq4;
    Button anyq,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        faq1=(TextView)findViewById(R.id.textView18);
        faq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Faqs.this,Faq1.class);
                startActivity(it);
            }
        });
        faq2=(TextView)findViewById(R.id.textView20);
        faq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(Faqs.this,Faq2.class);
                startActivity(it);
            }
        });
        faq3=(TextView)findViewById(R.id.textView21);
        faq3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Faqs.this,Faq3.class);
                startActivity(it);
            }
        });
        faq4=(TextView)findViewById(R.id.textView22);
        faq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Faqs.this,Faq4.class);
                startActivity(it);
            }
        });
        anyq=(Button)findViewById(R.id.button2);
        anyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Faqs.this,Question.class);
                startActivity(it);
            }
        });
        back=(Button)findViewById(R.id.button3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Faqs.this,Faq1.class);
                startActivity(it);
            }
        });

    }
}
