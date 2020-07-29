package com.example.week3_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.example.week3_test1.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v)
    {
        Intent i=new Intent(this, DisplayDetails.class);
        EditText et=findViewById(R.id.editTextTextPersonName);
        String s=et.getText().toString();
        i.putExtra(EXTRA_MESSAGE,s);
        startActivity(i);
    }

}