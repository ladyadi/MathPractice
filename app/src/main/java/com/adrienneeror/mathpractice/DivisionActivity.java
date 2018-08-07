package com.adrienneeror.mathpractice;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import java.lang.String;
import java.lang.Integer;
import java.util.Random;
import android.widget.EditText;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity {

    //variables
    int subject = 4;
    int answer = 0;
    int level = 1;
    int num1 = 0;
    int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        //generate a random number based on level
        genNum genLevel = new genNum();
        num1 = genLevel.genNum(level);
        num2 = genLevel.genNum(level);

        //generate a divison problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void submitAnswer(View view) {

        //read in user answer
        EditText a = (EditText) findViewById(R.id.answer);
        int answer = Integer.parseInt(a.getText().toString());

        //check to see if answer is correct
        isAnswerCorrect isA = new isAnswerCorrect();
        isA.isAnswerCorrect(subject, num1, num2, answer);

        //if incorrect display a try again response
        if(isA.isAnswerCorrect(subject, num1, num2, answer) == false)
        {
            genNegativeAnswer genNeg = new genNegativeAnswer();
            TextView neg = (TextView) findViewById(R.id.result_message);
            neg.setText(genNeg.genNegativeAnswer());
        }
        //else, if correct display positive response
        else {
            genPositiveAnswer genPos = new genPositiveAnswer();
            TextView pos = (TextView) findViewById(R.id.result_message);
            pos.setText(genPos.genPositiveAnswer());
        }
    }

    public void submitChoice(View view){

        //clear answer
        int answer = 0;
        EditText a = (EditText) findViewById(R.id.answer);
        a.setText("");

        //clear response text
        TextView response = (TextView) findViewById(R.id.result_message);
        response.setText("");

        //generate new random numbers
        genNum genLevel = new genNum();
        num1 = genLevel.genNum(level);
        num2 = genLevel.genNum(level);

        //generate a new divison problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genBeginner(View view){
        level = 1;

        //generate a random number based on level
        genNum genLevel = new genNum();
        num1 = genLevel.genNum(level);
        num2 = genLevel.genNum(level);

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genIntermediate(View view){
        level = 2;

        //generate a random number based on level
        genNum genLevel = new genNum();
        num1 = genLevel.genNum(level);
        num2 = genLevel.genNum(level);

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genAdvanced (View view){
        level = 3;

        //generate a random number based on level
        genNum genLevel = new genNum();
        num1 = genLevel.genNum(level);
        num2 = genLevel.genNum(level);

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }
}
