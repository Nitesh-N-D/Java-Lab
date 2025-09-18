## Number Guessing Game in Java  
Interactive console program to play a **number guessing game**.  
The program:  
- Randomly generates a secret number between 1 and 100  
- Lets the user guess the number with a maximum of 10 tries  
- Provides feedback if the guess is **too high** or **too low**  
- Tracks and displays **total games played** and **total guesses used**  
- Allows the user to **view status** or **quit** from the menu  
import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
    public static void main(String[] args) {
        int maxTries=10;
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int totalPlayed=0;
        int totalGuesses=0;
      
            gameLoop:
            while(true)
            {
                System.out.println("Menu:");
                System.out.println("1.Play Game");
                System.out.println("2.View Status");
                System.out.println("3.Quit");
                System.out.println("Choose an option:");
                int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                    int secretNumber=random.nextInt(100)+1;
                    int attempts=0;
                    boolean correct=false;
                    System.out.println("Guess the number between 1 and 100\nYou have "+maxTries+"tries");
                    System.out.println("Enter -1 to quit the game");
                    
                    for(int i=0;i<maxTries;i++)
                    {
                        System.out.println("Enter your guess:");
                        int guess=sc.nextInt();
                        if(guess==-1)
                        {
                            System.out.println("Exited");
                            break;
                        }
                        if(guess<1||guess>100)
                        {
                            System.out.println("Invalid input\nGuess must between 1 to 100");
                            i--;
                            continue;
                        }
                        attempts++;
                        totalGuesses++;
                        if(guess==secretNumber)
                        {
                            System.out.println("You guessed correctly");
                            correct=true;
                            break;
                        }
                        else if(guess<secretNumber)
                        {
                            System.out.println("Too low");
                        }
                        else 
                        {
                            System.out.println("Too high");
                        }
                        
                        if(i==maxTries-1)
                        {
                            System.out.println("You have used all your tries\nThe number is:"+secretNumber );

                        }
                    }
                            if (attempts > 0) {
                                totalPlayed++;
                            }
                            break;
                        }
                        case 2:
                            System.out.println("Status");
                            if (totalPlayed == 0) {
                                System.out.println("No games played");
                            } else {
                                double avg = (double) totalGuesses / totalPlayed;
                                System.out.println("Total Games played:" + totalPlayed);
                                System.out.println("Total guesses used:" + totalGuesses);
                            }
                            break;
                        case 3:
                            System.out.println("Quited");
                            break gameLoop;
                        default:
                            System.out.println("Invalid choice.Please choose 1,2 or 3");
                            break;
                    }
                }
                sc.close();
            }
        
    }

