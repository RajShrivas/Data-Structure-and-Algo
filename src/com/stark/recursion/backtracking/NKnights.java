package com.stark.recursion.backtracking;

public class NKnights {


    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knights(board, 0, 0, 4);
    }

    private static void knights(boolean[][] board, int row, int col, int knight) {

        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        //if board length reaches to the column, we can increase row by 1;
        if (col == board.length) {
            knights(board, row + 1, 0, knight);
        }

        // Checking is it safe to place the K if safe then only go to the next column and knight can be reduced by 1 otherwise it will only increase the column, but knight will be the same.
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }

        knights(board, row, col + 1, knight);
    }


    private static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean el : row) {
                if (el) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
