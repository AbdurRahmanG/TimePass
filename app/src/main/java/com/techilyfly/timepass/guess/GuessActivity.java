package com.techilyfly.timepass.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.techilyfly.timepass.R;

public class GuessActivity extends AppCompatActivity {

    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        int min = 1;
        int max  = 100;
        result = getRandomNumber(min, max);

    }

    static int getRandomNumber (int minNum, int maxNum){

        return (int) (Math.random() * (maxNum - minNum) + minNum);

    }

    public void guessFunction(View view){

        int guessNumber;

        EditText editTextGuessNumber;

        editTextGuessNumber = findViewById(R.id.editTextTextEnterGuessNumber);

        guessNumber = Integer.parseInt(editTextGuessNumber.getText().toString());

        if (guessNumber < result){
            Toast.makeText(this, "Guess Higher Number", Toast.LENGTH_SHORT).show();
        } else if (guessNumber > result){
            Toast.makeText(this, "Guess Lower Number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You Won!!!", Toast.LENGTH_SHORT).show();
        }

    }

}