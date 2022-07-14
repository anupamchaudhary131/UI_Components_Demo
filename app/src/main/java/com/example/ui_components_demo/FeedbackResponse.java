package com.example.ui_components_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FeedbackResponse extends AppCompatActivity {

    String res1, res2, res3, res4, res5, res6;
    TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_response);

        response = (TextView)findViewById(R.id.txtResponse);

        Intent intentResponse = getIntent();
        res1 = intentResponse.getStringExtra("response1");
        res2 = intentResponse.getStringExtra("response2");
        res3 = intentResponse.getStringExtra("response3");
        res4 = intentResponse.getStringExtra("response4");
        res5 = intentResponse.getStringExtra("response5");
        res6 = intentResponse.getStringExtra("response6");

        response.setText("User Response For If Shopping Is Hobby :"+" "+res1 +" "+ res2 +" "+ "\n User Response For How Often Shopping :" +" "+ res3 +" " +
               res4 +" "+ res5+"\n" + res6);
    }
}