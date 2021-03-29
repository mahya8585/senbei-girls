package com.example.smileComchase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DiaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        Button Button3 = findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish();}


        });
    }
}
