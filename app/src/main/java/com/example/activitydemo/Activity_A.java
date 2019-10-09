package com.example.activitydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_A extends AppCompatActivity {

    private static final String TAG = "Activity_A";

    Button btnA;
    Button btnB;
    TextView textA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        btnA = findViewById(R.id.btn_a);
        btnB = findViewById(R.id.btn_b);
        textA = findViewById(R.id.tv_a);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(Activity_A.class);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(Activity_B.class);
            }
        });

        textA.setText("The task id is : " + this.getTaskId() + "\nthis: " + this.toString());
        Log.i(TAG, "The task id is : " + this.getTaskId() + "\nthis: " + this.toString());
    }

    private void changeActivity(Class class1){
        Intent intent = new Intent(Activity_A.this, class1);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    //每当activity遇到意外情况的时候，重写这个方法来保存数据
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("key0", "value0");
        outState.putInt("key1", 1);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState: ");
    }

}
