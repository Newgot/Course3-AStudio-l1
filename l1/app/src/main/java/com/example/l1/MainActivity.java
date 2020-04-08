package com.example.l1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    double liters;
    double gallons;
    Button buttonHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView3);
    }
    public void onButtonClick(View v) {
        liters = Double.parseDouble(editText.getText().toString());
        gallons = liters * 0.264172;
        textView.setText(String.valueOf(gallons));
    }
    public void onClickHelp(View v){
                Intent intent = new Intent(this, HelpActivity.class);
                intent.putExtra("liters", String.valueOf(liters));
                intent.putExtra("gallons", String.valueOf(gallons));
                startActivity(intent);
    }
}
