package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvForgot, tvSignUp;
    
    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        tvForgot = findViewById(R.id.tvForgot);
        tvSignUp = findViewById(R.id.tvSignUp);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();
                password = etPassword.getText().toString().trim();

                validate();
            }
            
        });
    }
    
    private void validate() {
        if (email.isEmpty()){
            etEmail.setError("Email cannot be Empty");
        } else if (password.isEmpty() || password.length() < 4) {
            etPassword.setError("password cannot be Empty or less than 4");
        }else {
            Toast.makeText(getApplicationContext(), Text ,"Credential successfully entered", Toast.LENGTH_LONG).show();
        }
        }
    }    
        
    
    