package TemplateMethod;

import java.util.Random;
import java.util.Scanner;

public class RPS extends Game {

    boolean gameOver;
    boolean winner;
    String selection;
    String computerSelection;
    Random rng;
    Scanner scanner;

    public RPS() {
    }

    @Override
    void initializeGame() {
        System.out.println("Rock, Paper, Scissors");
        scanner = new Scanner(System.in);
        rng = new Random();
    }

    @Override
    void makePlay(int player) {

        System.out.println("R - Rock");
        System.out.println("P - Paper");
        System.out.println("S - Scissors");
        System.out.println("Choose your play:");

        int computerInt = rng.nextInt(3) + 1;
        if(computerInt == 1) computerSelection = "R";
        else if(computerInt == 2) computerSelection = "P";
        else if(computerInt == 3) computerSelection = "S";


        selection = scanner.next().toUpperCase();
        System.out.println("Computer's play: " + computerSelection);

        switch(selection) {
            case "R":
                if(computerSelection == "R") System.out.println("Draw.");
                else if(computerSelection == "P") System.out.println("Paper beats rock. You lose.");
                else if(computerSelection == "S") {
                    System.out.println("Rock beats scissors. You win.");
                    setWinner();
                    setGameOver();
                }
                break;
            case "P":
                if(computerSelection == "R") {
                    System.out.println("Paper beats rock. You win.");
                    setWinner();
                    setGameOver();
                }
                else if(computerSelection == "P") System.out.println("Draw.");
                else if(computerSelection == "S") System.out.println("Scissors beat paper. You lose.");
                break;
            case "S":
                if(computerSelection == "R") System.out.println("Rock beats scissors. You lose.");
                else if(computerSelection == "P") {
                    System.out.println("Scissors beat paper. You win.");
                    setWinner();
                    setGameOver();
                }
                else if(computerSelection == "S") System.out.println("Draw.");
                break;

        }

    }

    @Override
    boolean endOfGame() {
        return gameOver;
    }

    @Override
    void printWinner() {
        if(winner) System.out.println("You won. Congratulations!");
        else System.out.println("You lost. Game over.");

    }

    void setGameOver() {
        gameOver = !gameOver;
    }

    void setWinner() {
        winner = !winner;
    }
}
