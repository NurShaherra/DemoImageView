package com.example.a15031777.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivDay2 = (ImageView) findViewById(R.id.imageView2);
        //Set the image
        ivDay2.setImageResource(R.drawable.day2);

    }
}
