package com.example.ui_components_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView question1, question2;
    EditText edtComment;
    Button submit;
    CheckBox q1c1, q1c2, q2c1, q2c2, q2c3;
    String response1, response2, response3, response4, response5, comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        question1 = (TextView)findViewById(R.id.textview1);
        question2 = (TextView)findViewById(R.id.textview2);
        edtComment = (EditText)findViewById(R.id.editComment);
        submit = (Button)findViewById(R.id.submitButton);
        q1c1 = (CheckBox)findViewById(R.id.checkBox1);
        q1c2 = (CheckBox)findViewById(R.id.checkBox2);
        q2c1 = (CheckBox)findViewById(R.id.checkBox3);
        q2c2 = (CheckBox)findViewById(R.id.checkBox4);
        q2c3 = (CheckBox)findViewById(R.id.checkBox5);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //  question 1 Scenario

                if(q1c1.isChecked())
                {
                    response1 = q1c1.getText().toString();
                }
                else
                {
                    response1 = "Shopping Is Not User's Hobby";
                }
                if(q1c2.isChecked())
                {
                    response2 = q1c2.getText().toString();
                }
                else
                {
                    response2 = " ";
                }
                if(!q1c1.isChecked() && !q2c2.isChecked())
                {
                    response2 = " User Has Given No Feedback";
                }

            //  Question 2 Scenario

                if(q2c1.isChecked())
                {
                    response3 = q2c1.getText().toString();
                }
                else
                {
                    response3 = "User Don't Shop Daily";
                }
                if(q2c2.isChecked())
                {
                    response4 = q2c2.getText().toString();
                }
                else
                {
                    response4 = "User Don't Shop Weekly";
                }
                if(q2c3.isChecked())
                {
                    response5 = q2c3.getText().toString();
                }
                else
                {
                    response5 = "User Don't Shop Monthly";
                }

                Intent submitForm = new Intent(SecondActivity.this, FeedbackResponse.class);
                submitForm.putExtra("response1", response1);
                submitForm.putExtra("response2", response2);
                submitForm.putExtra("response3", response3);
                submitForm.putExtra("response4", response4);
                submitForm.putExtra("response5", response5);
                submitForm.putExtra("response6", edtComment.getText().toString());
                startActivity(submitForm);


            }
        });


    }
}