package com.example.androidintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStartBrowser;
    Button buttonStartBrowserWithLaunch;
    Button buttonExceptional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStartBrowser = (Button)findViewById(R.id.buttonstartbrowser);
        buttonStartBrowserWithLaunch = (Button)findViewById(R.id.buttonstartbrowserwithlaunchactivity);
        buttonExceptional = (Button)findViewById(R.id.buttonexceptionalcondition);

        buttonStartBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startBrowserIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.learnvern.com"));
                startActivity(startBrowserIntent);
            }
        });

        buttonStartBrowserWithLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startBrowserWithLaunch = getPackageManager().getLaunchIntentForPackage("https://www.learnvern.com");
                startActivity(startBrowserWithLaunch);
            }
        });

        buttonExceptional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exceptionalCondition = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.learnvern.com"));
                startActivity(exceptionalCondition);
            }
        });
    }
}