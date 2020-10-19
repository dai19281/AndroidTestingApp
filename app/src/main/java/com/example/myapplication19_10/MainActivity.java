package com.example.myapplication19_10;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "Nikos" ;
    public static final String TEXT_CONTENTS ="MainActivity_textView";
    private Button button;
    private TextView textView;

    private  int nunTimesClicked=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "TEXT");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView);

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               nunTimesClicked++;
               String result = "\n The button clicked " + nunTimesClicked + " times";
               textView.append(result);

            }
        };

        button.setOnClickListener(listener);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestard");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "TEXT");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.d(LOG_TAG, "onRestoreInstanceState");

        String key = null;
        assert savedInstanceState != null;
        String savedText= savedInstanceState.getString(key: "MainActivity");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(LOG_TAG, "onSaveInstanceState");
        outState.putString("MainActivity_textView", textView.getText().toString());
        super.onSaveInstanceState(outState);
        
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
}