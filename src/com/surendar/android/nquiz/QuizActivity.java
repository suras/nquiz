package com.surendar.android.nquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizActivity extends Activity {
    private TextView mQuizQuestion;
    private TextView mQuizAnswer;
    private int mAnswer;
    private int mPreviousAnswer = 0;
    private ImageButton mNextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mQuizQuestion = (TextView)findViewById(R.id.quiz_question);
        mQuizAnswer = (TextView)findViewById(R.id.quiz_answer);
        mNextButton = (ImageButton)findViewById(R.id.next_button);
        generateQuestion();
        mNextButton.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View V){
        		generateQuestion();
        	}	
        });
    }
    
    public void generateQuestion()
    {
    	Question question = new Question();
    	int first = question.generateRandomNumber(1,50);
    	int second = question.generateRandomNumber(51,100);
    	
    	if(mPreviousAnswer == 0)
    	{
    		mPreviousAnswer = first + second;
    	}
    	else
    	{
    	mPreviousAnswer = mAnswer;
    	}
    	mAnswer = first + second;
    	String questionString = ""+first+"+"+second+" = ?"+mPreviousAnswer;
    	setViewQuizQuestion(questionString);
    	setViewQuizAnswer(""+mAnswer);
    	
    }
    

   
    public void setViewQuizQuestion(String question_view)
    { 
    	mQuizQuestion.setText(question_view);
    	
    }
    
    public void setViewQuizAnswer(String answer_view)
    { 
    	mQuizAnswer.setText(answer_view);
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }
    
}
