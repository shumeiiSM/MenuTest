package com.example.a17010233.menutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddBill extends AppCompatActivity {

    Button btnBack;
    Button btnSave;
    EditText etAmount;
    Spinner spPaid;

    CheckBox cbSasa;
    CheckBox cbMk;
    CheckBox cbSj;
    CheckBox cbA;
    CheckBox cbH;

    TextView tvSasa;
    TextView tvMk;
    TextView tvSj;
    TextView tvA;
    TextView tvH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill);

        btnBack.findViewById(R.id.btnBack);
        btnSave.findViewById(R.id.buttonSave);
        etAmount.findViewById(R.id.editTextAmount);
        spPaid.findViewById(R.id.spinnerPaid);

        cbSasa.findViewById(R.id.checkBoxSa);
        cbMk.findViewById(R.id.checkBoxMk);
        cbSj.findViewById(R.id.checkBoxSj);
        cbA.findViewById(R.id.checkBoxA);
        cbH.findViewById(R.id.checkBoxH);

        tvSasa.findViewById(R.id.sasa);
        tvMk.findViewById(R.id.mk);
        tvSj.findViewById(R.id.sj);
        tvA.findViewById(R.id.bina);
        tvH.findViewById(R.id.hor);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), HomeFragment.class);
                startActivity(intent);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((cbSasa.isChecked()) && (cbMk.isChecked()) && (cbSj.isChecked()) &&  (cbA.isChecked()) && (cbH.isChecked())) {
                    String mySasa = getResources().getString(R.string.sasa);
                    String myMk = getResources().getString(R.string.mk);
                    String mySj = getResources().getString(R.string.sj);
                    String myBina = getResources().getString(R.string.bina);
                    String myHor = getResources().getString(R.string.hor);

                    Intent intent = new Intent(getBaseContext(), HomeFragment.class);
                    intent.putExtra("name", mySasa);
                    intent.putExtra("name", myMk);
                    intent.putExtra("name", mySj);
                    intent.putExtra("name", myBina);
                    intent.putExtra("name", myHor);
                    startActivity(intent);

                } else if (cbMk.isChecked()) {

                }

            }
        });



    }
}
