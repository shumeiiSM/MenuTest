package com.example.a17010233.menutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    Button btnBack;
    Button btnReset;

    EditText etPw;
    EditText etCPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        btnBack = findViewById(R.id.btnBack);
        btnReset = findViewById(R.id.buttonReset);
        etPw = findViewById(R.id.editTextPw);
        etCPw = findViewById(R.id.editTextCPw);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Forgot.class);
                startActivity(intent);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pw = etPw.getText().toString();
                String Cpw = etCPw.getText().toString();

                if ((pw.equals("")) || (Cpw.equals("")) || (!pw.equals(Cpw))) {
                    Toast.makeText(ResetPassword.this, "Your password is wrong!", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(ResetPassword.this, "Your password has successfully changed!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getBaseContext(), Login.class);
                    startActivity(intent);
                }

            }
        });
    }
}
