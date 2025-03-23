package com.rhythmusbyte.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button buttonAdd;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonAdd = findViewById(R.id.buttonAdd);
        textViewResult = findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNumber1.getText().toString();
                String num2Str = editTextNumber2.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    try {
                        double num1 = Double.parseDouble(num1Str);
                        double num2 = Double.parseDouble(num2Str);
                        double sum = num1 + num2;
                        textViewResult.setText("Result: " + sum);
                    } catch (NumberFormatException e) {
                        textViewResult.setText("Invalid input!");
                    }
                } else {
                    textViewResult.setText("Please enter both numbers.");
                }
            }
        });
    }
}
