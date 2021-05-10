import java.util.*;
import java.lang.*;

public class TicTacToe {
    public static char[][] board;
    public char[][] createBoard() {
		for(int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }
    public void showBoard() {
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++) {
                System.out.println(board[i][j] + " | ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        TicTacToe object = new TicTacToe();
        object.createBoard();
        object.showBoard();
    }
}