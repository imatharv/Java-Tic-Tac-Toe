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
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        TicTacToe object = new TicTacToe();
        char[] board = object.createBoard();
    }
}