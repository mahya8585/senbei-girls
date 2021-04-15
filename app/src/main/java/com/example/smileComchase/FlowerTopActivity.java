package com.example.smileComchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FlowerTopActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1001;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_top);
        imageView = findViewById(R.id.image_view);
        Button registeredblog = findViewById(R.id.submitbutton);
        registeredblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE );
                startActivityForResult(intent, RESULT_CAMERA);
            }
        });

        Button camerabutton = findViewById(R.id.opencamera);
        camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE );
                startActivityForResult(intent, RESULT_CAMERA);
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // requestしたコードがRESULT_CAMERAであるか確認する
        Bitmap bitmap;
        // cancelしたケースも含む
        if (data.getExtras() == null) {
            Log.d("debug", "cancel ?");
            return;
        } else {
            bitmap = (Bitmap) data.getExtras().get("data");
            if (bitmap != null) {
                // 画像サイズを計測
                int bmpWidth = bitmap.getWidth();
                int bmpHeight = bitmap.getHeight();
                Log.d("debug", String.format("w= %d", bmpWidth));
                Log.d("debug", String.format("h= %d", bmpHeight));
            }
        }



        imageView.setImageBitmap(bitmap);
    }
}

