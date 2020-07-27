package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btonGmail(View view)
    {
        startActivity(new Intent(getApplicationContext(),Gmail_UI.class));
        overridePendingTransition(0,0);
    }
    public void btonWinZip(View view)
    {
        startActivity(new Intent(getApplicationContext(),WinZip_UI.class));
        overridePendingTransition(0,0);
    }
    public void btonDrive(View view)
    {
        startActivity(new Intent(getApplicationContext(),GoogleDrive_UI.class));
        overridePendingTransition(0,0);
    }
}