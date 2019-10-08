package com.example.d20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView textViewComment;
    private SoundPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sound = new SoundPlayer( this);
        textViewComment = findViewById(R.id.tv);
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        sound.playHitSound();
        int randomNumber = rng.nextInt(20) + 1;
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textViewComment.setText("CriticalMiss!");
                sound.playHit1();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textViewComment.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textViewComment.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textViewComment.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textViewComment.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textViewComment.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textViewComment.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textViewComment.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textViewComment.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textViewComment.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textViewComment.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textViewComment.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textViewComment.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textViewComment.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textViewComment.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textViewComment.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textViewComment.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textViewComment.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textViewComment.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textViewComment.setText("CriticalHit!");
                sound.playHit20();
                break;
        }
    }
}
