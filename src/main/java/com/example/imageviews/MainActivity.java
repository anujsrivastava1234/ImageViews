package com.example.imageviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Method To change images
                ImageView img=findViewById(R.id.img);

                Toast.makeText(MainActivity.this, "Button is CLicked", Toast.LENGTH_SHORT).show();

                img.setImageResource(R.drawable.image);

            }
        });
    }
}