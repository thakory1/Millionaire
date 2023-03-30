package com.example.millionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionTenActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    TextView Question;
    TextView money;

    Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ten);

        Question = findViewById(R.id.Question);
        radioGroup = findViewById(R.id.radioGroup);
        money = findViewById(R.id.moneyEarned);
        money.setText("You earned: $32000");
        buttonContinue = findViewById(R.id.button_continue);

        //CHANGE TO RIGHT ANSWER
        String correctAnswer = "Diwali";

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);

                if(radioButton.getText().equals(correctAnswer)){
                    startActivity(new Intent(QuestionTenActivity.this, EndActivity.class));
                    Toast.makeText(getApplicationContext(),"Correct, you earned $64000!", Toast.LENGTH_SHORT).show();
                    //CHANGE TO NEXT ACTIVITY

                }
                else{
                    startActivity(new Intent(QuestionTenActivity.this, EndActivity.class));
                    Toast.makeText(getApplicationContext(),"Wrong!", Toast.LENGTH_SHORT).show();
                    money.setText("You earned: $0");

                }
            }
        });
    }

    public void checkButton(View view) {

    }
}