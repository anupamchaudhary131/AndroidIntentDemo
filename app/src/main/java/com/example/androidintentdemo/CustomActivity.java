package com.example.androidintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        TextView label = (TextView)findViewById(R.id.showData);
        Uri url = getIntent().getData();
        label.setText(url.toString());

    }
}