/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sdowling.numbersgame;

/**
 *
 * @author stephendowling
 */

import java.util.*;

public class NumbersGame {

    public static void main(String[] args) {
        //declare variables 
        String name;
        int guess, guessCount;
        int number=1+(int)(100*Math.random());
        //declare & create objects 
        Scanner keyboard=new Scanner(System.in);
        //input
        System.out.println("Hello! Please enter your name...");
        name=keyboard.nextLine();
        System.out.println("Welcome to the Guess the Number game "+name+"! The aim of the game is to guess the correct number between 1 and 100. How many guesses would you like?");
        guessCount=keyboard.nextInt();
        for(int i=0;i<guessCount;i++){
            System.out.println("Please enter guess number "+(i+1)+"...");
            guess=keyboard.nextInt();
            if(number==guess){
                System.out.println("Congratulations "+name+"! You have guessed the correct number!");
                break;
            }
            else if(number>guess&&i!=guessCount-1){
                System.out.println("The number is greater than "+guess);
            }
            else if(number<guess&&i!=guessCount-1){
                System.out.println("The number is less than "+guess);
            }
            else if(i==(guessCount-1)){
            System.out.println("Oh dear "+name+", you have run out of guesses! The number was "+number);
            }
        }
        keyboard.close();
    }//main
    
}//class

