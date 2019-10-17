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

    ListView countList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_log);

        SharedPreferences sharedPrefer = getSharedPreferences("sfStr", Context.MODE_PRIVATE);



        countList = findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        countList.setAdapter(arrayAdapter);
    }
}
