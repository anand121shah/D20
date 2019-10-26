package com.example.d20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KeyLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_log);

        TextView scoreView1 = findViewById(R.id.view_1);
        TextView scoreView2 = findViewById(R.id.view_2);
        TextView scoreView3 = findViewById(R.id.view_3);
        TextView scoreView4 = findViewById(R.id.view_4);
        TextView scoreView5 = findViewById(R.id.view_5);
        TextView scoreView6 = findViewById(R.id.view_6);
        TextView scoreView7 = findViewById(R.id.view_7);
        TextView scoreView8 = findViewById(R.id.view_8);
        TextView scoreView9 = findViewById(R.id.view_9);
        TextView scoreView10 = findViewById(R.id.view_10);
        TextView scoreView11 = findViewById(R.id.view_11);
        TextView scoreView12 = findViewById(R.id.view_12);
        TextView scoreView13 = findViewById(R.id.view_13);
        TextView scoreView14 = findViewById(R.id.view_14);
        TextView scoreView15 = findViewById(R.id.view_15);
        TextView scoreView16 = findViewById(R.id.view_16);
        TextView scoreView17 = findViewById(R.id.view_17);
        TextView scoreView18 = findViewById(R.id.view_18);
        TextView scoreView19 = findViewById(R.id.view_19);
        TextView scoreView20 = findViewById(R.id.view_20);

        SharedPreferences sharedPref = getSharedPreferences("diceVal", Context.MODE_PRIVATE);

        int val1 = sharedPref.getInt("d1", 0);
        int val2 = sharedPref.getInt("d2", 0);
        int val3 = sharedPref.getInt("d3", 0);
        int val4 = sharedPref.getInt("d4", 0);
        int val5 = sharedPref.getInt("d5", 0);
        int val6 = sharedPref.getInt("d6", 0);
        int val7 = sharedPref.getInt("d7", 0);
        int val8 = sharedPref.getInt("d8", 0);
        int val9 = sharedPref.getInt("d9", 0);
        int val10 = sharedPref.getInt("d10", 0);
        int val11 = sharedPref.getInt("d11", 0);
        int val12 = sharedPref.getInt("d12", 0);
        int val13 = sharedPref.getInt("d13", 0);
        int val14 = sharedPref.getInt("d14", 0);
        int val15 = sharedPref.getInt("d15", 0);
        int val16 = sharedPref.getInt("d16", 0);
        int val17 = sharedPref.getInt("d17", 0);
        int val18 = sharedPref.getInt("d18", 0);
        int val19 = sharedPref.getInt("d19", 0);
        int val20 = sharedPref.getInt("d20", 0);

        scoreView1.setText("D1 rolled: " + (val1));
        scoreView2.setText("D2 rolled: " + (val2));
        scoreView3.setText("D3 rolled: " + (val3));
        scoreView4.setText("D4 rolled: " + (val4));
        scoreView5.setText("D5 rolled: " + (val5));
        scoreView6.setText("D6 rolled: " + (val6));
        scoreView7.setText("D7 rolled: " + (val7));
        scoreView8.setText("D8 rolled: " + (val8));
        scoreView9.setText("D9 rolled: " + (val9));
        scoreView10.setText("D10 rolled: " + (val10));
        scoreView11.setText("D11 rolled: " + (val11));
        scoreView12.setText("D12 rolled: " + (val12));
        scoreView13.setText("D13 rolled: " + (val13));
        scoreView14.setText("D14 rolled: " + (val14));
        scoreView15.setText("D15 rolled: " + (val15));
        scoreView16.setText("D16 rolled: " + (val16));
        scoreView17.setText("D17 rolled: " + (val17));
        scoreView18.setText("D18 rolled: " + (val18));
        scoreView19.setText("D19 rolled: " + (val19));
        scoreView20.setText("D20 rolled: " + (val20));
    }
}
