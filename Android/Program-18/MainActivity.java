package com.rhythmusbyte.background;

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
        screen.setBackground(getDrawable(R.drawable.bg3));
        int img[] = {
                R.drawable.bg1,
                R.drawable.bg2,
                R.drawable.bg3
        };
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int rNo = r.nextInt(img.length);
                screen.setBackground(getDrawable(img[rNo]));
                String str = "Index: " + rNo;
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });
    }
}
