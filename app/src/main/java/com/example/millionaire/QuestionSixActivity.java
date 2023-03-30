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

public class QuestionSixActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    TextView Question;
    TextView money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);

        Question = findViewById(R.id.Question);
        radioGroup = findViewById(R.id.radioGroup);
        money = findViewById(R.id.moneyEarned);
        money.setText("You earned: $2000");

        Button buttonContinue = findViewById(R.id.button_continue);

        //CHANGE TO RIGHT ANSWER
        String correctAnswer = "Transformers";


        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);

                if(radioButton.getText().equals(correctAnswer)){
                    Toast.makeText(getApplicationContext(),"Correct, you earned $4000!", Toast.LENGTH_SHORT).show();
                    //CHANGE TO NEXT ACTIVITY
                    startActivity(new Intent(QuestionSixActivity.this, QuestionSevenActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong!", Toast.LENGTH_SHORT).show();
                    money.setText("You earned: $0");
                    startActivity(new Intent(QuestionSixActivity.this, EndActivity.class));
                }
            }
        });
    }

    public void checkButton(View view) {

    }
}