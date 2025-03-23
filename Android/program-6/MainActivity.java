package com.rhythmusbyte.hello;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      RadioGroup rg = findViewById(R.id.radioGroupGender);
      Button btn = findViewById(R.id.buttonSubmit);

      btn.setOnClickListener(v -> {
         int id = rg.getCheckedRadioButtonId();
         if (id != -1) {
            RadioButton rb = findViewById(id);
            Toast.makeText(this, "Selected: " + rb.getText(), Toast.LENGTH_SHORT).show();
         } else {
            Toast.makeText(this, "No Gender Selected", Toast.LENGTH_SHORT).show();
         }
      });
   }
}
