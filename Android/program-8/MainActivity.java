package com.rhythmusbyte.hello;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean running = false;
    private Chronometer chronometer;
    private Button btnStartStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
        btnStartStop = findViewById(R.id.btnStartStop);

        btnStartStop.setOnClickListener(v -> {
            if (!running) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                btnStartStop.setText("Stop");
                running = true;
            } else {
                chronometer.stop();
                btnStartStop.setText("Start");
                running = false;
            }
        });
    }
}
