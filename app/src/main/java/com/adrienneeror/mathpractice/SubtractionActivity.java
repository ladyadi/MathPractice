package com.adrienneeror.mathpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SubtractionActivity extends AppCompatActivity {

    //variables
    int subject = 2;
    int answer = 0;
    int subLevel = 1;
    int num1 = 0;
    int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        num1 = new Random().nextInt(10 + 1 - 5) + 5;
        num2 = new Random().nextInt(5 + 1 - 0) + 0;

        //generate a subtraction problem with random numbers
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
        if(subLevel == 1){
            num1 = new Random().nextInt(10 + 1 - 5) + 5;
            num2 = new Random().nextInt(5 + 1 - 0) + 0;
        }
        else if (subLevel == 2){
            num1 =  new Random().nextInt(99 +1 - 50) + 50;
            num2 = new Random().nextInt(50 + 1 - 10) + 10;
        }
        else if (subLevel == 3) {
            num1 = new Random().nextInt(999 + 1 - 500) + 500;
            num2 = new Random().nextInt(500 + 1 - 100) + 100;
        }

        //generate a new subtraction problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genBeginner(View view){
        subLevel = 1;

        //clear answer
        int answer = 0;
        EditText a = (EditText) findViewById(R.id.answer);
        a.setText("");

        //clear response text
        TextView response = (TextView) findViewById(R.id.result_message);
        response.setText("");

        num1 = new Random().nextInt(10 + 1 - 5) + 5;
        num2 = new Random().nextInt(5 + 1 - 0) + 0;

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genIntermediate(View view){
        subLevel = 2;

        //clear answer
        int answer = 0;
        EditText a = (EditText) findViewById(R.id.answer);
        a.setText("");

        //clear response text
        TextView response = (TextView) findViewById(R.id.result_message);
        response.setText("");

        num1 =  new Random().nextInt(99 + 1 - 50) + 50;
        num2 = new Random().nextInt(50 + 1 - 10) + 10;

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }

    public void genAdvanced (View view){
        subLevel = 3;

        //clear answer
        int answer = 0;
        EditText a = (EditText) findViewById(R.id.answer);
        a.setText("");

        //clear response text
        TextView response = (TextView) findViewById(R.id.result_message);
        response.setText("");

        num1 = new Random().nextInt(999 + 1 - 500) + 500;
        num2 = new Random().nextInt(500 + 1 - 100) + 100;

        //generate a random number based on level

        //generate an addition problem with random numbers
        genQuestion genQ = new genQuestion();
        genQ.genQuestion(subject, num1, num2);

        //print random problem to screen
        String problem = genQ.genQuestion(subject, num1, num2);
        TextView t = (TextView) findViewById(R.id.problem);
        t.setText(problem);
    }
}

