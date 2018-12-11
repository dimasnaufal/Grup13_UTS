package com.polinema.meme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeScreen extends AppCompatActivity {

    Button button;
    Button button2;
<<<<<<< HEAD
    Button button3;
=======
    Button btnNexLok;
    Button btnPlayback;
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

<<<<<<< HEAD
        button = (Button)findViewById(R.id.button_next);
        button2 = (Button)findViewById(R.id.button_meme);
        button3 = (Button)findViewById(R.id.button_video);
=======
        button = (Button) findViewById(R.id.button_next);
        button2 = (Button) findViewById(R.id.button_meme);
        btnNexLok =(Button) findViewById(R.id.btnNexkLo);
        btnPlayback = (Button) findViewById(R.id.btnPlayback) ;
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent next = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(next);
            }
        });

        btnPlayback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(HomeScreen.this, PlayBack.class);
                startActivity(next);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent meme = new Intent(HomeScreen.this, Main2Activity.class);

                startActivity(meme);
            }
        });

<<<<<<< HEAD
        button3.setOnClickListener(new View.OnClickListener() {
=======
        btnNexLok.setOnClickListener(new View.OnClickListener() {
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a

            @Override
            public void onClick(View v) {

<<<<<<< HEAD
                Intent video = new Intent(HomeScreen.this, Main3Activity.class);

                startActivity(video);
            }
        });


=======
                Intent next = new Intent(HomeScreen.this, LokasiActivity.class);
                startActivity(next);
            }
        });
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
    }
}
