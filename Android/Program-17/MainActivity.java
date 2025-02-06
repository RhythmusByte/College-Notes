package com.rhythmusbyte.background;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View screen = findViewById(R.id.main);
        Button btn = findViewById(R.id.btn);

        int color[] = {
                Color.BLACK,
                Color.BLUE,
                Color.GREEN,
                Color.RED,
                Color.CYAN,
                Color.MAGENTA
        };
        screen.setBackgroundColor(Color.BLACK);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int index = r.nextInt(color.length);
                screen.setBackgroundColor(color[index]);
            }
        });
    }
}