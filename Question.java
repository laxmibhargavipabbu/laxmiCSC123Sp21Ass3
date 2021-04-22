package laxmiCSC123Sp21Ass3;
import java.io.*;
import java.util.*;

public class Question 
{
	public final int NUM_ANSWERS = 4; 
   	private String questionText;
   	private String [] possibleAnswers = new String[NUM_ANSWERS];
	private int correctAnswerNumber;
	
	public Question()
	{
		setQuestionText("");
		setCorrectAnswerNumber(0);
		for(int i=0; i<possibleAnswers.length;i++)
		{
			setPossibleAnswer("",NUM_ANSWERS);
		}
	}
	
	public void setQuestionText(String text)
	{
		this.questionText = text;
	}
	
	public void setCorrectAnswerNumber(int crctans)
	{
		this.correctAnswerNumber = crctans;
	}
	
	public String getQuestionText()
	{
		return questionText;
	}
	
	public int getCorrectAnswerNumber()
	{
		return correctAnswerNumber;
	}
	
	public void setPossibleAnswer(String strAns, int ans)
	{
		possibleAnswers[ans-1] = strAns;
	}
	
	public String getPossibleAnswer(int ans)
	{
		return possibleAnswers[ans-1];
	}
	
	public String getCorrectAnswer(int ans)
	{
		return possibleAnswers[ans-1];
	}
}