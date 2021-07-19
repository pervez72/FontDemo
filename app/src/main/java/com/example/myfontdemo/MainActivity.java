package com.example.myfontdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;

    private Typeface typeface1,typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.textView1Id);
        textView1=findViewById(R.id.textView2Id);

        typeface1 =Typeface.createFromAsset(getAssets(),"font/Norfolk.otf");
        textView1.setTypeface(typeface1);
    }
}