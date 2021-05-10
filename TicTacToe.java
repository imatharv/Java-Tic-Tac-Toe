import java.util.*;
import java.lang.*;

public class TicTacToe {
    public static char[] createBoard() {
        char[] board = new char[9];
        for(int i=0; i<board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    public static char chooseUserLetter(Scanner userInput) {
        System.out.println("Select your letter (X/O): ");
        return userInput.next().toUpperCase().charAt(0);
    }
    public static void showBoard(char[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-------------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-------------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        Scanner userInput = new Scanner(System.in);
        TicTacToe object = new TicTacToe();
        char[] board = createBoard();
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        System.out.println("Computer letter: "+computerLetter);
        showBoard(board);
    }
}