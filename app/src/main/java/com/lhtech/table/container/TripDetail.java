package com.lhtech.table.container;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TripDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_detail);
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        String[][] data = {
                {"Job type", "Delivery"},
                {"Broker name","Seatram Logistics Pty Ltd"},
                {"Client name", "MICRON SECURITY PRODUCTS"},
                {"Delivery address","U49/ 20 TUCKS RD, SEVENT HILLS NSW 2147"},
                {
                    "Door", "DOOR FRONT"
                },
                {
                    "Container no","MRSU617676"
                },
                {"Container size","40HC"},
                {"Release no.","87963489"},
                {"Weight declaration", "Net weight:8.58  \nTare weight:3.97  \nGross weight:12.55"},
                {"Description","VIDEO DOOR PHONE"},
                {"Client info"," 7:30AM - 4PM (UP TO %PM)\nSimon Jabour 0413 074 4444\n1cont/ day"},
                {"Client note","DEL MON 11-12PM"},
                {"Client attachment",""},
                {"Doc attachment","File.PDF"}};

        int index = 0;
        for (String[] item : data) {
            TableRow tableRow = new TableRow(this);
            int dynamicId = View.generateViewId();
            tableRow.setId(dynamicId);

            tableRow.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT
            ));






            TextView sttView = new TextView(this);
            sttView.setText(item[0]);
            TableRow.LayoutParams sttTableRow = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f);
            sttView.setLayoutParams(sttTableRow);
            sttView.setPadding(12, 16 ,16 ,12);
            sttView.setTextColor(Color.BLACK);
            sttView.setTextSize(20);

            tableRow.addView(sttView);



            TextView dateView = new TextView(this);
            dateView.setText(item[1]);
            TableRow.LayoutParams dateTableRow = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f);
            dateView.setLayoutParams(dateTableRow);
            dateView.setPadding(0, 16 ,16 ,12);
            dateView.setTextColor(Color.BLACK);
            dateView.setGravity(Gravity.END);
            tableRow.addView(dateView);





            View divider  = new View(this);
            TableLayout.LayoutParams dividerParams = new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    2);
            divider.setLayoutParams(dividerParams);
            divider.setBackgroundColor(Color.GRAY); // Màu của divider
            tableRow.setGravity(Gravity.CENTER);




            tableLayout.addView(tableRow);
            tableLayout.addView(divider);
            index ++;
        }
        ImageButton back = findViewById(R.id.imageButton);
        back.setOnClickListener(view -> {
            Intent i = new Intent(TripDetail.this, Epod.class);
            startActivity(i);
            finish();
        });
    }
}