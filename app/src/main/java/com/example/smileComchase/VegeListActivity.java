package com.example.smileComchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class VegeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegelist);

        ImageButton sendImageButton = findViewById(R.id.imageButton);
        sendImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), TomatoDetailActivity.class);
                startActivity(intent);
            }

        });

        //lambda式
        //sendImageButton.setOnClickListener(v -> {
            //Intent intent = new Intent(getApplication(), SubActivity.class);
            //startActivity(intent);

        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), PotatoDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}

