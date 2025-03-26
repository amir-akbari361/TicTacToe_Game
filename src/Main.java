import java.util.Scanner;

public class Main {
    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
         PrintBoard();
        boolean gameRunning = true;
    }



    public static void PrintBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
    }
    private static void SwitchPlayer() {
        currentPlayer = (currentPlayer=='X')?'O':'X';
    }
    private static boolean isTie()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] == ' ')return false;
            }
        }
        return true;
    }
    private static boolean isWinner()
    {
       return true;
    }



}
