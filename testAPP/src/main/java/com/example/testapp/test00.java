package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test00 extends AppCompatActivity {
    private String TAG="MAIN_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onCreate");
    }

    public void onButtonClicked(View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);

    }







    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_test00);
        Log.d(TAG, "onPause");
    }

}

