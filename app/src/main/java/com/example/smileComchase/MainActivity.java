package com.example.smileComchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToFlowerTop = findViewById(R.id.goToFlowerTop);
        goToFlowerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), FlowerTopActivity.class);
                startActivity(intent);
            }
        });

        Button goToShopping = findViewById(R.id.GoToShopping);
        goToShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), VegeListActivity.class);
                startActivity(intent);
            }
        });

    }
}