package com.example.d20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView textViewComment;
    private SoundPlayer sound;
    private Button logButton;

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
        logButton =  findViewById(R.id.log_button);
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogActivity();
            }
        });
    }

    public void openLogActivity(){
        Intent intent = new Intent(this, KeyLogActivity.class);
        startActivity(intent);
    }

    private void rollDice() {
        sound.playHitSound();
        int randomNumber = rng.nextInt(20) + 1;
        SharedPreferences sharedPrefer = getSharedPreferences("diceValues", Context.MODE_PRIVATE);
        int hit = sharedPrefer.getInt("d" + (randomNumber), 0);
        hit++;

        SharedPreferences.Editor editor = sharedPrefer.edit();
        editor.putInt("d" + (randomNumber), hit);
        editor.commit();

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textViewComment.setText(R.string.critical_miss);
                sound.playHit1();
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textViewComment.setText("");
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textViewComment.setText("");
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textViewComment.setText("");
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textViewComment.setText("");
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textViewComment.setText("");
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textViewComment.setText("");
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textViewComment.setText("");
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textViewComment.setText("");
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textViewComment.setText("");
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textViewComment.setText("");
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textViewComment.setText("");
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textViewComment.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textViewComment.setText("");
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textViewComment.setText("");
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textViewComment.setText("");
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textViewComment.setText("");
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textViewComment.setText("");
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textViewComment.setText("");
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textViewComment.setText(R.string.critical_hit);
                sound.playHit20();
        }
    }
}
