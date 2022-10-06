package com.fdiaz.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvSaludo;
    private Button btnSaludo;
    private RadioGroup radioGroup;
    private RadioButton rbUbicacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvSaludo = (TextView) findViewById(R.id.tvSaludo);
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        radioGroup = (RadioGroup) findViewById(R.id.rg_ubicacion);

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                tvSaludo.setText("Hola amigos!");
            }
        });
        Log.i("INFO: ", "onCreate");

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Toast.makeText(getApplicationContext(), "Ubicacion seleccionada", Toast.LENGTH_SHORT).show();
                rbUbicacion = findViewById(radioGroup.getCheckedRadioButtonId());
                Log.i("INFO: ", rbUbicacion.getText().toString());
            }
        });
    }

    public void saludar (View v) {
        tvSaludo.setText(tvSaludo.getText() +"Bienvenido Franco Diaz");

    }

    public void iniciarActv2(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);


        if (v.getId() == R.id.btn_Activ22) {
            startActivity(intent);

        }else {
            intent.putExtra("dato", "buenas :D");
            startActivity(intent);
        }
    }
    public void Actividadnro4 (View view) {
        Intent intent = new Intent(this, ForthActivity.class);
        startActivity(intent);
    }

    public void Actividadnro5 (View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info: ", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO: ", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO: ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO: ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO: ", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("INFO:", "onRestart");
    }

    public void ChangeColor () {

    }


}