package com.example.l1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.Objects;

public class HelpActivity extends AppCompatActivity {

    TextView textViewGallons;
    TextView textViewLiters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        textViewGallons = findViewById(R.id.textView4);
        textViewLiters = findViewById(R.id.textView5);
        Intent intent = getIntent();

        String gallons = intent.getStringExtra("gallons");
        String liters = intent.getStringExtra("liters");
        textViewLiters.setText(liters);
        textViewGallons.setText(gallons);

    }

}
