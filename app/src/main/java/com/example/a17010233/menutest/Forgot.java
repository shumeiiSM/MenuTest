package com.example.a17010233.menutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forgot extends AppCompatActivity {

    Button btnBack;
    Button btnSend;
    Button btnSubmit;

    EditText etAC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        btnBack = findViewById(R.id.btnBack);
        btnSend = findViewById(R.id.buttonSend);
        btnSubmit = findViewById(R.id.buttonSubmit);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Login.class);
                startActivity(intent);
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Forgot.this, "Access Code: 230178", Toast.LENGTH_LONG).show();
            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), ResetPassword.class);
                    startActivity(intent);


            }
        });

    }
}
