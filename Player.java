package laxmiCSC123Sp21Ass3;
import java.io.*;
import java.util.*;

public class Player 
{
	private int playerNumber, points, currentAnswer;
	
	public Player(int playerNmber)
	{
		setPlayerNumber(playerNmber);
		setPoints(0);
	}
	
	public void setPlayerNumber(int playerNumber)
	{
		this.playerNumber = playerNumber;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	public int getPlayerNumber()
	{
		return playerNumber;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void chooseAnswer(Scanner scnr)
	{
		System.out.printf("Enter the number of the correct answer: ");
		currentAnswer = scnr.nextInt();
	}
	
	public int getCurrentAnswer()
	{
		return currentAnswer;
	}
	
	public void incrementPoints()
	{
		this.points = points+1;
	}
}
