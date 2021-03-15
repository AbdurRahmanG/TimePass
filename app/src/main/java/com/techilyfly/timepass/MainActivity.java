package com.techilyfly.timepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techilyfly.timepass.guess.GuessActivity;

public class MainActivity extends AppCompatActivity {

    Button GuessGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This Button Will Send You Guess Game Activity
        GuessGame = (Button) findViewById(R.id.buttonGuessGame);

        // By this Function You will Go from MainActivity to GussGame Activity
        GuessGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGuessGame = new Intent(MainActivity.this, GuessActivity.class);
                startActivity(intentGuessGame);
            }
        });

    }
}