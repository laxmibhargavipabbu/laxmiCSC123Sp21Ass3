package laxmiCSC123Sp21Ass3;
import java.io.*;
import java.util.*;

public class TriviaGame
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void initQuestions(ArrayList<Question> questAL) throws IOException
	{
		System.out.printf("Please enter name of the file with the questions: ");
		String input = keyboard.next();
		File inputFile = new File(input);
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFile);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		while(inputReader.hasNextLine())
		{
			Question tempQuestion = new Question();
			tempQuestion .setQuestionText(inputReader.nextLine());
			for (int j = 1; j <= 4; j++)
			{
				tempQuestion.setPossibleAnswer(inputReader.nextLine(), j);
			}
			tempQuestion.setCorrectAnswerNumber(Integer.parseInt(inputReader.nextLine()));
			questAL.add(tempQuestion);
		}
	}
	
	public static void displayQuestion(Question question, int playerNum)
	{
		System.out.printf("\nQuestion for player #%d\n",playerNum);
		System.out.printf("------------------------\n");
		System.out.printf(question.getQuestionText());
		System.out.printf("\n");
		for (int i = 1; i <= 4; i++)
		{
			System.out.println(i + ". " + question.getPossibleAnswer(i));
		}
	}
	
	public static void showGameResults(Player[] players)
	{
		System.out.println("Game Over!");
		System.out.println("---------------------");
		System.out.println("Player 1's points: " + players[0].getPoints());
		System.out.println("Player 2's points: " + players[1].getPoints());
		if (players[0].getPoints() > players[1].getPoints())
		{
			System.out.println("Player 1 wins!");
		}
		else if (players[1].getPoints() > players[0].getPoints())
		{
			System.out.println("Player 2 wins!");
		}
		else
		{
			System.out.println("It's a TIE!");
		}
	}
	
	public static void main(String [] args) throws IOException
	{
		final int NUM_PLAYERS = 2;
		int numQuestions = 0;
		int playerTurn = 1;    
		int questionNum;       
		int playerAnswer;      
		int player1points = 0; 
		int player2points = 0; 
		
		Player[] players = new Player[NUM_PLAYERS];
		ArrayList<Question> questions = new ArrayList<Question>();
		for(int i=0;i<players.length;i++)
		{
			players[i] = new Player(i+1);
		}
		initQuestions(questions);
		for(int i=0;i<questions.size();i++)
		{
			displayQuestion(questions.get(i),playerTurn);
			
			players[playerTurn - 1].chooseAnswer(keyboard);
			
			if (questions.get(i).getCorrectAnswerNumber() == players[playerTurn - 1].getCurrentAnswer())
			{
				System.out.printf("Correct!\n");
				players[playerTurn -1].incrementPoints();
			}
			else
			{
				System.out.printf("Sorry, that is incorrect. The correct answer is: %d\n", questions.get(i).getCorrectAnswerNumber());
			}
			if (playerTurn == 1)
			{
				playerTurn = 2;
			}
			else
			{
				playerTurn = 1;
			}
		}
		showGameResults(players);
	}
}