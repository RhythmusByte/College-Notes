package com.rhythmusbyte.hello;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main_menu, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      String msg = "";
      switch (item.getItemId()){
         case R.id.item1: msg = "Item 1 Selected"; break;
         case R.id.item2: msg = "Item 2 Selected"; break;
         case R.id.item3: msg = "Item 3 Selected"; break;
         default: return super.onOptionsItemSelected(item);
      }
      Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
      return true;
   }
}
