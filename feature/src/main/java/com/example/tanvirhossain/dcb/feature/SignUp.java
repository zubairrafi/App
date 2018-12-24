package com.example.tanvirhossain.dcb.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignUp extends AppCompatActivity {

    Button sign;
    TextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        sign=(Button) findViewById(R.id.Signupbtn);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(SignUp.this,HomePage.class);
                startActivity(it);
            }

        });
        login =(TextView) findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(SignUp.this,loginpage.class);
                startActivity(it2);
            }
        });
    }
}
