package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgottenpass extends AppCompatActivity {
    private EditText etForgotEmail;
    private Button btnReset;

    private String mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgottenpass);

        etForgotEmail = findViewById(R.id.etForgotEmail);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail = etForgotEmail.getText().toString().trim();

                Validate();

            }
        });
    }

    private void Validate() {
        if (mail.isEmpty()){
            etForgotEmail.setError("Please Enter A Valid Email Address");
    }else {
            Toast.makeText(getApplicationContext(), mail, Toast.LENGTH_LONG).show();
        }
}
}