package com.fdiaz.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {
    private ProgressBar progressBar, progressBar_horiz;
    private Button btnIncr, btnDecr, btnIncrementar;
    private TextView tvProgress;
    private int progressVal1 = 0;
    private int progressVal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar_horiz = (ProgressBar) findViewById(R.id.progress_bar_horiz);
        tvProgress = (TextView) findViewById(R.id.tv_progress);
        progressBar.setProgress(0);

        btnIncr = (Button) findViewById(R.id.button_incr);
        btnDecr = (Button) findViewById(R.id.button_decr);
        btnIncrementar = (Button) findViewById(R.id.btn_incrementar);


    }

    public void establecerProgreso(View view) {
        progressVal1 += 10;
        progressBar_horiz.setProgress(progressVal1);
    }

    public void establecerProgresoIncr(View view) {
        if (progressVal <= 90)
            progressVal += 10;
        progressBar.setProgress(progressVal);
        if (progressVal == 110)
            progressVal = 0;
        tvProgress.setText(Integer.toString(progressVal) + "%");
    }

    public void establecerProgresoDecr(View view) {
        if (progressVal >= 10)
            progressVal -= 10;
        progressBar.setProgress(progressVal);
        if (progressVal == 110)
            progressVal = 0;
        tvProgress.setText(Integer.toString(progressVal) + "%");
    }


}


