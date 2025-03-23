package com.rhythmusbyte.hello;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Spinner spinner = findViewById(R.id.spinner);
      Button btnShow = findViewById(R.id.btn_show);
      String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

      ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      spinner.setAdapter(adapter);

      btnShow.setOnClickListener(v -> 
         Toast.makeText(this, "Selected: " + spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show()
      );
   }
}
