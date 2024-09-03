package com.lhtech.table.container;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SignatureView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signature_view);
        ImageButton backButton = findViewById(R.id.imageButton1);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View view){
                finish();
            }
        });

    }
}