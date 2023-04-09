package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java was introduced in 1970" ,"Java is a person?" , "java is developed using python" , "java use interface" , "can java achieve pure abstraction?"};
    private boolean[] answers = {false ,false , false , true , true};
    private int score =0;
    private int index =0;
    private Button yes;
    private Button no;
    private TextView ques;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        ques = findViewById((R.id.textView3));
        ques.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(answers[index]){
                        ++score;
                    }
                    Toast.makeText(MainActivity.this, "Score is "+ score, Toast.LENGTH_SHORT).show();
                    ques.setText(questions[++index]);
                }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answers[index]){
                    ++score;
                }
                Toast.makeText(MainActivity.this, "Score is "+ score, Toast.LENGTH_SHORT).show();
                ques.setText(questions[++index]);
            }
        });

    }
}