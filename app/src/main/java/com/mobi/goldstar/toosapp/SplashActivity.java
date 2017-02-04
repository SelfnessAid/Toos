package com.mobi.goldstar.toosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView signupBtn;
    private TextView signinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        signupBtn = (TextView) findViewById(R.id.signup_button);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(signupIntent);
            }
        });
        signinBtn = (TextView) findViewById(R.id.logIn_button);
        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signinIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(signinIntent);
            }
        });
    }
}
