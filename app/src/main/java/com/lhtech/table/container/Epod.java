package com.lhtech.table.container;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Epod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epod);
        TableLayout tableLayout = findViewById(R.id.tableLayout);
//        tableLayout.setBackground(new BitmapDrawable(getResources(), String.valueOf(R.drawable.background_epod)));
        Drawable background = tableLayout.getBackground();
        if (background != null) {
            background.setAlpha(60);
        }
        // Dữ liệu mẫu
        String[][] data = {


                {"1", "23/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"2", "24/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"3", "25/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"4", "26/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"5", "27/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"6", "28/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"7", "29/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"8", "30/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"9", "31/01\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"10", "01/02\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"11", "02/02\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"12", "03/02\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},
                {"13", "04/02\n07:00", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."},

        };

        // Thêm dữ liệu vào bảng
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
            tableRow.addView(dateView);


            TextView contentView = new TextView(this);
            contentView.setText(item[2]);
            TableRow.LayoutParams contentTableRow = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 4f);
            if(index==0){
                contentView.setBackgroundColor(Color.rgb(140,177,211 ));
            }
            contentView.setPadding(12, 16 ,16 ,12);
            contentView.setTextColor(Color.BLACK);
            contentView.setLayoutParams(contentTableRow);
            contentView.setMaxLines(2);
            contentView.setEllipsize(TextUtils.TruncateAt.END);

            tableRow.addView(contentView);


            View divider  = new View(this);
            TableLayout.LayoutParams dividerParams = new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    2);
            divider.setLayoutParams(dividerParams);
            divider.setBackgroundColor(Color.GRAY); // Màu của divider
            tableRow.setGravity(Gravity.CENTER);



            tableRow.setOnClickListener(view ->{
                Intent i = new Intent(Epod.this, TripDetail.class);
                startActivity(i);
            });


            tableLayout.addView(tableRow);
            tableLayout.addView(divider);
            index ++;
        }
        ImageButton menu = findViewById(R.id.imageButton);
        menu.setOnClickListener(view -> {
            Intent i = new Intent(Epod.this, DriverTimeSheet.class);
            startActivity(i);

        });

    }



}