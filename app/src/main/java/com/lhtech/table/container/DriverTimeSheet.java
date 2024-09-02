package com.lhtech.table.container;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class DriverTimeSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_time_sheet);
      EditText editText = findViewById(R.id.date);

        // Optional: Thiết lập giá trị mặc định cho EditText
        editText.setText("02/09/2024");
        editText.setEnabled(false);

    }
}