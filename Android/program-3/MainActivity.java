package com.rhythmusbyte.hello;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCurrentDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCurrentDateTime = findViewById(R.id.text_view_current_date_time);
        Button buttonShowDateTime = findViewById(R.id.button_show_date_time);

        buttonShowDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCurrentDateTime();
            }
        });
    }

    private void showCurrentDateTime() {
        String currentDateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date());
        textViewCurrentDateTime.setText("Current Date and Time: " + currentDateTime);

        new AlertDialog.Builder(this)
            .setTitle("Current Date and Time")
            .setMessage(currentDateTime)
            .setPositiveButton("OK", null)
            .show();
    }
}
