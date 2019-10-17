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

//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
//                int d1 = sharedPrefer.getInt(getString(R.string.keyPress1), 0);
//                int d2 = sharedPrefer.getInt(getString(R.string.keyPress2), 0);
//                int d3 = sharedPrefer.getInt(getString(R.string.keyPress3), 0);
//                int d4 = sharedPrefer.getInt(getString(R.string.keyPress4), 0);
//                int d5 = sharedPrefer.getInt(getString(R.string.keyPress5), 0);
//                int d6 = sharedPrefer.getInt(getString(R.string.keyPress6), 0);
//                int d7 = sharedPrefer.getInt(getString(R.string.keyPress7), 0);
//                int d8 = sharedPrefer.getInt(getString(R.string.keyPress8), 0);
//                int d9 = sharedPrefer.getInt(getString(R.string.keyPress9), 0);
//                int d10 = sharedPrefer.getInt(getString(R.string.keyPress10), 0);
//                int d11 = sharedPrefer.getInt(getString(R.string.keyPress11), 0);
//                int d12 = sharedPrefer.getInt(getString(R.string.keyPress12), 0);
//                int d13 = sharedPrefer.getInt(getString(R.string.keyPress13), 0);
//                int d14 = sharedPrefer.getInt(getString(R.string.keyPress14), 0);
//                int d15 = sharedPrefer.getInt(getString(R.string.keyPress15), 0);
//                int d16 = sharedPrefer.getInt(getString(R.string.keyPress16), 0);
//                int d17 = sharedPrefer.getInt(getString(R.string.keyPress17), 0);
//                int d18 = sharedPrefer.getInt(getString(R.string.keyPress18), 0);
//                int d19 = sharedPrefer.getInt(getString(R.string.keyPress19), 0);
//                int d20 = sharedPrefer.getInt(getString(R.string.keyPress20), 0);
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
        SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textViewComment.setText(R.string.critical_miss);
                sound.playHit1();
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d1 = sharedPrefer.getInt(getString(R.string.keyPress1), 0);
                d1++;
                SharedPreferences.Editor editor = sharedPrefer.edit();
                editor.putInt(getString(R.string.keyPress1), d1);
                editor.apply();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d2 = sharedPrefer.getInt(getString(R.string.keyPress2), 0);
                d2++;
                SharedPreferences.Editor editor2 = sharedPrefer.edit();
                editor2.putInt(getString(R.string.keyPress2), d2);
                editor2.apply();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d3 = sharedPrefer.getInt(getString(R.string.keyPress3), 0);
                d3++;
                SharedPreferences.Editor editor3 = sharedPrefer.edit();
                editor3.putInt(getString(R.string.keyPress3), d3);
                editor3.apply();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d4 = sharedPrefer.getInt(getString(R.string.keyPress4), 0);
                d4++;
                SharedPreferences.Editor editor4 = sharedPrefer.edit();
                editor4.putInt(getString(R.string.keyPress4), d4);
                editor4.apply();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d5 = sharedPrefer.getInt(getString(R.string.keyPress5), 0);
                d5++;
                SharedPreferences.Editor editor5 = sharedPrefer.edit();
                editor5.putInt(getString(R.string.keyPress5), d5);
                editor5.apply();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d6 = sharedPrefer.getInt(getString(R.string.keyPress6), 0);
                d6++;
                SharedPreferences.Editor editor6 = sharedPrefer.edit();
                editor6.putInt(getString(R.string.keyPress6), d6);
                editor6.apply();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d7 = sharedPrefer.getInt(getString(R.string.keyPress7), 0);
                d7++;
                SharedPreferences.Editor editor7 = sharedPrefer.edit();
                editor7.putInt(getString(R.string.keyPress7), d7);
                editor7.apply();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d8 = sharedPrefer.getInt(getString(R.string.keyPress8), 0);
                d8++;
                SharedPreferences.Editor editor8 = sharedPrefer.edit();
                editor8.putInt(getString(R.string.keyPress8), d8);
                editor8.apply();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d9 = sharedPrefer.getInt(getString(R.string.keyPress9), 0);
                d9++;
                SharedPreferences.Editor editor9 = sharedPrefer.edit();
                editor9.putInt(getString(R.string.keyPress9), d9);
                editor9.apply();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d10 = sharedPrefer.getInt(getString(R.string.keyPress10), 0);
                d10++;
                SharedPreferences.Editor editor10 = sharedPrefer.edit();
                editor10.putInt(getString(R.string.keyPress10), d10);
                editor10.apply();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d11 = sharedPrefer.getInt(getString(R.string.keyPress11), 0);
                d11++;
                SharedPreferences.Editor editor11 = sharedPrefer.edit();
                editor11.putInt(getString(R.string.keyPress11), d11);
                editor11.apply();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d12 = sharedPrefer.getInt(getString(R.string.keyPress12), 0);
                d12++;
                SharedPreferences.Editor editor12 = sharedPrefer.edit();
                editor12.putInt(getString(R.string.keyPress12), d12);
                editor12.apply();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d13 = sharedPrefer.getInt(getString(R.string.keyPress13), 0);
                d13++;
                SharedPreferences.Editor editor13 = sharedPrefer.edit();
                editor13.putInt(getString(R.string.keyPress13), d13);
                editor13.apply();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d14 = sharedPrefer.getInt(getString(R.string.keyPress14), 0);
                d14++;
                SharedPreferences.Editor editor14 = sharedPrefer.edit();
                editor14.putInt(getString(R.string.keyPress14), d14);
                editor14.apply();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d15 = sharedPrefer.getInt(getString(R.string.keyPress15), 0);
                d15++;
                SharedPreferences.Editor editor15 = sharedPrefer.edit();
                editor15.putInt(getString(R.string.keyPress15), d15);
                editor15.apply();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d16 = sharedPrefer.getInt(getString(R.string.keyPress16), 0);
                d16++;
                SharedPreferences.Editor editor16 = sharedPrefer.edit();
                editor16.putInt(getString(R.string.keyPress16), d16);
                editor16.apply();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d17 = sharedPrefer.getInt(getString(R.string.keyPress17), 0);
                d17++;
                SharedPreferences.Editor editor17 = sharedPrefer.edit();
                editor17.putInt(getString(R.string.keyPress17), d17);
                editor17.apply();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d18 = sharedPrefer.getInt(getString(R.string.keyPress18), 0);
                d18++;
                SharedPreferences.Editor editor18 = sharedPrefer.edit();
                editor18.putInt(getString(R.string.keyPress18), d18);
                editor18.apply();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textViewComment.setText("");
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d19 = sharedPrefer.getInt(getString(R.string.keyPress19), 0);
                d19++;
                SharedPreferences.Editor editor19 = sharedPrefer.edit();
                editor19.putInt(getString(R.string.keyPress19), d19);
                editor19.apply();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textViewComment.setText(R.string.critical_hit);
                sound.playHit20();
//                SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);
                int d20 = sharedPrefer.getInt(getString(R.string.keyPress20), 0);
                d20++;
                SharedPreferences.Editor editor20 = sharedPrefer.edit();
                editor20.putInt(getString(R.string.keyPress20), d20);
                editor20.apply();
                break;
        }
    }
}
