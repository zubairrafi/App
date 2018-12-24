package com.example.tanvirhossain.dcb.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {

    Button login;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        login= (Button)findViewById(R.id.loginbtn_field);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(loginpage.this,HomePage.class);
                startActivity(it);
            }
        });
       signup=(TextView)findViewById(R.id.Sign_field);
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it=new Intent(loginpage.this,SignUp.class);
               startActivity(it);
           }
       });
    }
}
