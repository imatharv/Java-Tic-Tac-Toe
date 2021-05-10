import java.util.*;
import java.lang.*;

public class TicTacToe {
    private static char[] createBoard() {
        char[] board = new char[10];
        for(int i=0; i<board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    public void chooseLetter() {
        String computerLetter, playerLetter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your letter (X/O): ");
        playerLetter = scanner.nextLine();

        if(playerLetter.equals("X")) { 
            computerLetter = "O";
            System.out.println("Computer letter: "+computerLetter);
        } else if(playerLetter.equals("O")) {
            computerLetter = "X";
            System.out.println("Computer letter: "+computerLetter);
        } else {
            System.out.println("Incorrect input");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        TicTacToe object = new TicTacToe();
        char[] board = object.createBoard();
        object.chooseLetter();
    }
}