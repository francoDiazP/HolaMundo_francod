package com.fdiaz.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDato = (TextView) findViewById(R.id.tv_dato);
        Intent intent = getIntent();
        tvDato.setText(intent.getStringExtra("dato"));

        if (intent.getStringExtra("dato")!=null) {
            tvDato.setText(intent.getStringExtra("dato"));
        }
    }
}