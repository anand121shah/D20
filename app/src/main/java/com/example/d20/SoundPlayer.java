package com.example.d20;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPlayer {

    private static SoundPool soundPool;
    private static int hitSound;
    private static int hit1;
    private static int hit20;

    public SoundPlayer(Context context){
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        hitSound = soundPool.load(context, R.raw.rolldice, 1);
        hit1 = soundPool.load(context, R.raw.hit1, 1);
        hit20 = soundPool.load(context, R.raw.hit20, 1);
    }

    public void playHitSound(){
        soundPool.play(hitSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }
    public void playHit1(){
        soundPool.play(hit1, 1.0f, 1.0f, 1, 0, 1.0f);
    }
    public void playHit20(){
        soundPool.play(hit20, 1.0f, 1.0f, 1, 0, 1.0f);
    }
}
