package com.example.ui_components_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocomplete;
    Button buttonDemo;

    String[] arraySuggestion = {"LearnVern", "LearnSites", "LearnAndroid", "LearnJava", "LearnDesign", "learnMoblieApplications", "LearnByHeart"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocomplete = (AutoCompleteTextView)findViewById(R.id.autoCompleteID);
        buttonDemo = (Button)findViewById(R.id.button);

        ArrayAdapter<String> adapterString = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item);
        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapterString);

        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successfully User Reached To Feedback Form", Toast.LENGTH_LONG).show();
                Intent intentClick = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentClick);
            }
        });
    }

    public void demoClick(View v)
    {
        Toast.makeText(getApplicationContext(), "Successfully Reached To Android Developers Community", Toast.LENGTH_LONG).show();
        Uri Android = Uri.parse("https://developer.android.com");
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Android);
        startActivity(websiteIntent);
    }
}