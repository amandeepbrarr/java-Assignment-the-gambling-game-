
//Name: Amandeep singh Brar
//Student ID:201904508
//Date Submitted: 20/03/2021
//Class IN2203 Section Number G2
//Name of work: Assignment 1: The gambling Game
import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);c
        public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("let's get started");
                    g1.PlayGame();
                    p1.User();
                    p1.getNumber();
                    p1.GameAlgorithm();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will win ");
        ComputerGuess= ComputerGuess();
        
        
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    int Number;
    Game g2= new Game();
    Scanner sc= new Scanner(System.in);
    
    public void User()
    {
        String userName;
        int userAge;
         System.out.println("Enter user name");
      userName= sc.nextLine();
        System.out.println("Enter user Age");
        userAge= sc.nextInt();
         
    }
    public void getNumber()
    {
        
        System.out.println("Guess a number");
            Number= sc.nextInt();
    }
    public void GameAlgorithm()
    {
        int numberOfTries=5 ;
        int i=1;
        
      while(i<=numberOfTries)
        { 
          i++;
            if(Math.abs(Number - g2.ComputerGuess)<20 )
            {System.out.println("congrats ! You win ");
                System.out.println("Number to guess is  " + g2.ComputerGuess );
                break;
            }
            
            else 
            {
                System.out.println(" your Guess is wrong");
            }
            
            if(i==numberOfTries)
            {
                System.out.println("Game over");
                System.out.println("The number to be guessed was"+ ComputerGuess);
            }
            
            
        }
        
        
    }
    
}