package com.example.mad_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user_email, user_pw;
    Button btn_login;

    ImageView btn_google, btn_facebook, btn_github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_email=findViewById(R.id.user_email);
        user_pw=findViewById(R.id.user_pw);
        btn_login=findViewById(R.id.btn_login);
        btn_google=findViewById(R.id.btn_google);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email=String.valueOf(user_email.getText());
                password=String.valueOf(user_pw.getText());
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Login.this, "Email cant be empty", Toast.LENGTH_SHORT).show();
                    return;
                }if(TextUtils.isEmpty(password)){
                    Toast.makeText(Login.this, "Password cant be blank", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });



    }
}