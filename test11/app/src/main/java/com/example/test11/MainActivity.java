package com.example.test11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //New account 클릭시 sign up 페이지로 이동
        Button NewAccount = findViewById(R.id.NewAccount);
        NewAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Create_Account.class);
                startActivity(intent);
            }
        });

        //ForgotPassword 클릭시 forgotpassword 페이지로 이동
        ImageButton ForgotPassword = (ImageButton) findViewById(R.id.ForgotPassword);
        ForgotPassword.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Forgot_Password.class);
                startActivity(intent);
            }
        });

        //Sign in 클릭시 activity_main 페이지로 이동
        ImageButton Sign_in = (ImageButton) findViewById(R.id.Sign_in);
        Sign_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Calender_btn.class);
                startActivity(intent);
            }
        });


        }
    }
