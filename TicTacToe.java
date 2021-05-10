import java.util.*;
import java.lang.*;

public class TicTacToe {
    public static char[] createBoard() {
        char[] board = new char[10];
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
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-------------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-------------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    public static void playerMove(char[] board, char userLetter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position you want to move to (must be betwween 1 to 9): ");
        int position = scanner.nextInt();

        if(position >= 1 && position <= 9 && board[position] == ' ') {
            board[position] = userLetter;
        }
        else if(position >= 1 && position <= 9 && board[position] != ' ') {
            System.out.println("Position is already taken, enter another position: ");
            position = scanner.nextInt();
            if(position >= 1 && position <= 9 && board[position] == ' ') {
                board[position] = userLetter;
            }
        }
        else {
        	System.out.println("Invalid position.");
        }	
        showBoard(board);
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
        playerMove(board, userLetter);
    }
}