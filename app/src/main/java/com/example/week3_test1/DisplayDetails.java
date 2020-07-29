package com.example.week3_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details);

        Intent i=getIntent();

        String s=i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tv=findViewById(R.id.tvDisplayMessage);
        tv.setText(s);


    }
}