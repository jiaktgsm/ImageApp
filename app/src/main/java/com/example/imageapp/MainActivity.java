package com.example.imageapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView hImageViewSemafor;
    private Button hButton;

    private int currentImage = 0;
    int[] images = {R.drawable.mario, R.drawable.androidrobot, R.drawable.facebook,
     R.drawable.twitter, R.drawable.smile, R.drawable.corom, R.drawable.ghost, R.drawable.clock,
     R.drawable.vector};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hImageViewSemafor = (ImageView) findViewById(R.id.idImageViewSemafor);
        hButton = (Button) findViewById(R.id.idBtnChangeImage);

        hButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                currentImage++;
                currentImage = currentImage % images.length;
                hImageViewSemafor.setImageResource(images[currentImage]);
            }
        });
    }
}
